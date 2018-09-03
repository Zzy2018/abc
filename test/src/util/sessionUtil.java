package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class sessionUtil {
private static SessionFactory factory;
static {
	Configuration configuration = new Configuration();
	configuration.configure();
	factory = configuration.buildSessionFactory();
}
public static Session getSession() {
	return factory.openSession();
}
public static Session getCurentSession() {
	return factory.getCurrentSession();
}
}
