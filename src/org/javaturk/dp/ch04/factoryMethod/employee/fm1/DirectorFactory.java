package org.javaturk.dp.ch04.factoryMethod.employee.fm1;

import org.javaturk.dp.ch04.factoryMethod.employee.EmployeeRandomizer;

public class DirectorFactory implements Factory {

	@Override
	public Director create() {
		Director director = new Director(EmployeeRandomizer.createId(), EmployeeRandomizer.createName(),
				EmployeeRandomizer.createYear(), "Management", "Management", 5000);
		return director;
	}

}
