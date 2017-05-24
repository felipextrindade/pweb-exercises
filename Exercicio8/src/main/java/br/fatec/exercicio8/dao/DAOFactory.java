package br.fatec.exercicio8.dao;

import br.fatec.exercicio8.utils.HibernateUtil;

public class DAOFactory {

	
	public static UsuarioDAO criaUsuarioDAO() {
	UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		      usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
	}



}
