package com.struts.pre;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginPre extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String name=request.getParameter("username");
		String email = request.getParameter("email");
		

		
		request.setAttribute("name", "Hi "+name);
		request.setAttribute("email", "email id is : "+email);
		
		if(name.equals("maha")) {
			return mapping.findForward("success");			
		}else {
			return mapping.findForward("failure");
		}
		
		
		
		
	}
}
