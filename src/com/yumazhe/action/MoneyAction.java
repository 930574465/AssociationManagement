package com.yumazhe.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yumazhe.pojo.IncomeOrPayout;
import com.yumazhe.pojo.Money;
import com.yumazhe.pojo.User;
import com.yumazhe.service.IncomeOrPayoutService;
import com.yumazhe.service.MoneyService;
import com.yumazhe.service.UserService;

public class MoneyAction extends ActionSupport implements ModelDriven<IncomeOrPayout> {

	private static final long serialVersionUID = 7754099853866121392L;
	private IncomeOrPayout incomeOrPayout = new IncomeOrPayout();
	private MoneyService moneyService;
	private IncomeOrPayoutService incomeOrPayoutService;
	private UserService userService;
	
	private HttpServletRequest request;
	private Map<String, Object> session;
	
	private int start = 0;
	private int size = 10;
	
	private String applicantUser;
	
	public MoneyAction() {
		request = ServletActionContext.getRequest();
		session = ActionContext.getContext().getSession();
	}
	
	public void setMoneyService(MoneyService moneyService) {
		this.moneyService = moneyService;
	}
	
	public void setIncomeOrPayoutService(IncomeOrPayoutService incomeOrPayoutService) {
		this.incomeOrPayoutService = incomeOrPayoutService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void setApplicantUser(String applicantUser) {
		this.applicantUser = applicantUser;
	}

	@Override
	public IncomeOrPayout getModel() {
		return incomeOrPayout;
	}
	
	public String queryByPage() {
		boolean flag = true;
		try {
			Money money = moneyService.query();
			if (money != null) {
				request.setAttribute("money", money);
			} else {
				flag = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		
		List<IncomeOrPayout> incomeOrPayoutList = null;
		try {
			incomeOrPayoutList = incomeOrPayoutService.queryByPage(start, size);
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		
		if (incomeOrPayoutList == null) {
			flag = false;
		}
		
		if (flag) {
			request.setAttribute("incomeOrPayoutList", incomeOrPayoutList);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String add() {
		boolean flag = true;
		if (incomeOrPayout.getMoney() == null) {
			flag = false;
		}
		if (incomeOrPayout.getSourceOrDestination()!=null && !incomeOrPayout.getSourceOrDestination().trim().equals("")) {
			incomeOrPayout.setSourceOrDestination(incomeOrPayout.getSourceOrDestination().trim());
		} else {
			flag = false;
		}
		if (incomeOrPayout.getType() == null) {
			flag = false;
		}
		
		incomeOrPayout.setDate(new Date());
		if (session.get("loginedUser") != null) {
			User dbUser = userService.query(((User)session.get("loginedUser")).getNumber());
			incomeOrPayout.setAgent(dbUser);
		} else {
			flag = false;
		}
		
		if (applicantUser!=null && !applicantUser.trim().equals("")) {
			try {
				User applicant = userService.query(applicantUser);
				if (applicant==null) {
					flag = false;
				} else {
					incomeOrPayout.setApplicant(applicant);
				}
			} catch (Exception e) {
				e.printStackTrace();
				flag = false;
			}
		} else {
			flag = false;
		}
		
		if (flag) {
			incomeOrPayoutService.add(incomeOrPayout);
			request.setAttribute("addResult", true);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String remove() {
		boolean flag = true;
		IncomeOrPayout dbIncomeOrPayout = null;
		try {
			dbIncomeOrPayout = incomeOrPayoutService.queryById(incomeOrPayout.getId());
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		}
		if (dbIncomeOrPayout != null) {
			try {
				incomeOrPayoutService.remove(dbIncomeOrPayout);
			} catch (Exception e) {
				e.printStackTrace();
				flag = false;
			}
		} else {
			flag = false;
		}
		
		if (flag) {
			request.setAttribute("removeResult", true);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
}
