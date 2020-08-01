package hibernate.concepts;

import java.util.Date;

import org.hibernate.Session;

import hibernatepractice.pojo.User;
import hibernateutil.HibernateUtil;

public class Main {
	public static void main(String[] args) {

		/* save update delete */

		// InsertRecord.insert();
		// Loadrecords.load();
		// Delete.delete();
		// Update.updatewithoutcall();
		// Loadrecords.load();
		// Update.updatewithcall();
		// Loadrecords.load();

		/* Inheritence */
		// Inheritence.onetableInheritencce();
		// Inheritence.tablePerClassInheritencce();
		 //Inheritence.tablePerConcreteClassInheritencce();

		/* compositeprimarykey */
		//CompositePrimaryKey.save();
		// CompositePrimaryKey.load();

		/* HQL Language */
		// HqlLanguage.selectpartiob();
		// HqlLanguage.selectsingleval();
		// HqlLanguage.selectwholeob();

		/* HQL Language runtimeparams */
		// HqlLanguage.runtimevallabel();
		// HqlLanguage.runtimevalquesmark();

		/* criterias */
		// Criterias.load();
		//Criterias.sortorder();
		//Criterias.projections();
		//Criterias.multipleProjections();
		
		/* Native query */
		//NativeQuery.load();
		
		/* namedquery */
		Namedquery.namedQuery();
	}

}
