package user1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.UserDAO;
import entity.User;

public class AddUserSelvet extends HttpServlet   {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");

		/**request.setCharacterEncoding("utf-8");  
		 * 
		 * ���߷���ˣ���ζ�����������н���
		 * ע�����д���Ҫ��ӵ����е�getparamenter����ǰ��
		 * ֻ���post������Ч
		 * ע����δ������Ҫ�ӵ�����
		 * URIEncoding="utf-8"
		 * ע��ֻ���get������Ч
		 */

		/**�ȼ���û����Ƿ���ڣ�������ڣ�����ʾ�û��û����Ѿ����ڣ�
		 * ���� ���û���Ϣ���뵽���ݿ�
		 */
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("user");
		if (obj==null) {
			response.sendRedirect("login.jsp");
			return;
		}
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			UserDAO dao=new UserDAO();
			User u1 = dao.find(username);

			
			if (u1!=null) {//˵���û�����
				request.setAttribute("msg", "�û����Ѿ�����");

				request.getRequestDispatcher("addUser.jsp").forward(request, response);	
			}else{ //�û���Ϊ��
				User u = new User();
				u.setUsername(username);
				u.setPassword(password);
				u.setEmail(request.getParameter("email"));
				dao.Save(u);//������
				/**
				 * �ض����û��б�
				 */
				response.sendRedirect("list");

				/**
				 * ����tcp/ip monitor ץ������
				 */
				System.out.println("�ض���ִ��");
			}
			
		} catch (Exception e) {
			/**��¼��־�������ֳ���
			 */
			e.printStackTrace();
			/**���쳣�ܷ�ָ���������ָܻ�(�������ݿ������ͣ���������жϵȳ�֮Ϊ��ϵͳ�쳣)��ֻ��Ҫ��ʾ�û��Ժ����ԡ�
			 */
			request.setAttribute("error", "ϵͳ��æ�����Ժ�����");
			request.getRequestDispatcher("error.jsp").forward(request, response);

		}
		
		
	}



}
