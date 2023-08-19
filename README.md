**Introduction**

Welcome to the OfficeMart Test Automation Project, created as part of the SmartAcademy course. This project aims to provide test automation for the officemart.ge website, a marketplace for stationary goods and office supplies. By automating testing, this project enhances website reliability.

**Main Features**
- Website Testing Automation: Automate testing of officemart.ge functionalities, including cart operations, forms, and search.
- Efficiency and Reliability: Automating repetitive tests improves efficiency and consistency across runs.
- Test Suite Organization: Utilize TestNG for test grouping, parallel execution, and comprehensive reports.
- Parallel Test Execution: Run tests in parallel for quicker results, useful for large test suites.
- Documentation: Clear documentation assists in setup and usage. This README provides essential guidance.

**Getting Started**
Follow these steps to set up and use the Officemart Test Automation project.

**Prerequisites**
- Install Java Development Kit (JDK).
- Install Maven.

**Installation**
1. Clone the repository:
`git clone https://github.com/zpartskhaladze/Officemart.git`
2. Navigate to the project directory:
`cd Officemart`
3. Install project dependencies using Maven:
`mvn install`

**Usage**
After installing the project and dependencies, use provided configurations to run test suites.

1. Open the testng.xml file in the project root.
2. Customize test suites and parameters.
3. Run test suites using IDEs, command-line tools, or build systems.

**Configuration**
Modify project settings in testng.xml. Adjust suite names, parallel threads, and other parameters.

**Tests**
Run tests by executing test suites in testng.xml. This automates officemart.ge website testing.

**Allure Reports**
This project integrates Allure Reports for enhanced test reporting. After running tests, you can generate interactive HTML reports using Allure. To view reports, run the following command:
`allure serve allure-results`

**Contributing**
Contribute via pull requests or issues in the GitHub repository https://github.com/zpartskhaladze/Officemart.git

**License**
This project is licensed under the MIT License. Use, modify, and distribute per license terms.


**Acknowledgements**
Thanks to SmartAcademy for this project opportunity. Appreciation to officemart.ge for collaboration on test automation.
