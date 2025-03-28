3) what type of tests have you automated?
our main focus is to automate test cases to do regression testing, functional testing (smoke and sanity) .sometimes based on
project and the test time estimation we do focus on end to end testing.

4) how many test cases you have automated per day ?
It depends on test cases scenario complexity and length .I did sometimes 5-6 test scenarios per day when the complexity
is limited like need to send buy and sell order modify its price and volume then partial fill and full the order
and cancel this order n check depth.. sometimes just 2 or 3 ,fewer test scenarios in a day when the complexity is high
like as send quote modify it partial quote fill then requote it then again partial fill full fill check TOB ,BBO,
some where need to send values from csv.file and also sometimes in between order flow need to restart TR and MD gateway.

5) what is framework?
A framework defines a set of rules or best practices which we can follow a systematic way to achieve that desired results.
There are different types of automation frameworks and the most common ones are -
data driven testing framework
keyword driven testing framework
hybrid testing framework

6) have you created any framework?
 -> No ,i didn't get a chance to create framework from scratch but i have contributed in terms of creating libraries ,
creating test cases,my team lead and my senior automation engineer were creating the utility and libraries for us and top of
that I am contributing test scenarios, and writing test scenarios , writing testng classes and preparing test data for that.
I have used the framework which is already available.

7) can you explain the framework which you have used in your selenium Project?
see architecture of POM design with selenium -part 1

8)why do you prefer selenium automation tool ?
- free and open source
- have large user base and helping communities
- cross browser compatibility
- platform compatibility
- multiple programming languages support

9) what is selenium ?
->Selenium is an open source automated testing suite to test web applications .It supports different platforms and browsers.
 It has getting a lot of popularity in terms of web based automated testing and giving a great competition to the famous
 commercial tool HP QTP ( Quick test professional ) AKA HP UFT ( Unified Functional Testing).
 Selenium is a set of different software tools .Each tool has a different approach in supporting web bases automation testing.
 It has 4 component namely ,
 - selenium IDE (integrated development environment )
 - Selenium RC ( Remote control ) selenium 1
 - Selenium webdriver  - selenium 2 & 3
 - Selenium Grid

 10) What is selenium IDE?
 Selenium IDE is a firefox plugin. It is the simplest framework in the selenium suite.It allows us to record and playback
 the Scripts. Even though we can create scripts using selenium IDE . we need to use Selenium RC or selenium webdriver to
 write more advanced and robust test cases.

11) what is Selenese?
Selenese is the languages which is used to write test scripts in Selenium IDE .

13) what is selenium RC?
->

14) what is selenium WebDriver ?(IMP)
selenium webDriver AKA selenium 2 is a browser automation framework that accepts commands and sends them to browser .It is
implemented through a browser specific driver . It controls the browser by directly communicating with it. Selenium Webdriver
supports Java ,C# ,PHP, Python ,Perl , Ruby.  (video- selenium webDriver architecture)-Product based company

*Selenium WebDriver is an open-source tool that automates browser interactions. it means that accepts commands and sends
them to browser .It's part of the Selenium framework, which is a collection of tools and libraries for automating web
browsers.

How it works
=============
Selenium WebDriver uses client libraries and the JSON wire protocol to communicate with browsers.
It can perform actions like form submissions, navigation, and interacting with dynamic web elements.
It supports many programming languages, including Python, Java, and JavaScript.
It can be used to test web applications across different browsers and operating systems.
Why it's useful
===================
It helps ensure that websites function as intended on different browsers.
It can automate dynamic websites where the content changes based on user actions.
It's an essential tool for software developers and quality assurance professionals.
Selenium WebDriver use cases
============================
Creating and executing test cases
Automating browser-related test cases
Performing complex tests that need to loop, perform setup, or interact with external systems

15) Selenium Grid?
Selenium grid is a tool used together with selenium RC to run tests to different machines against different browsers in
parallel . That is running multiple tests at the same time against different machines running different browsers and
operating systems . In simple words it is used to distribute your test execution on multiple platforms and environments
concurrently.(parallel mode)

Want to run tests in parallel across multiple machines? Then, Grid is for you.
Selenium Grid allows the execution of WebDriver scripts on remote machines by routing commands sent by the client to
remote browser instances.

Grid aims to:
Provide an easy way to run tests in parallel on multiple machines
Allow testing on different browser versions
Enable cross platform testing

16) When do you use Selenium Grid?
- Selenium grid can be used to execute same or different test scripts on multiple platforms and browsers concurrently
so as to achieve distributed test execution.

17) Advantages -
It allows running test cases in parallel thereby saving test execution time .
- It allows multi browser testing .
- It allows us to execute test cases on multi platform.

18) Hub in selenium Grid ?
A hub is a server or a central point that controls the test execution on different machines.

19) Node in selenium Grid ?
Node is the machine which is attached to the hub . There can be multiple nodes in Selenium Grid.

20) What are the types of WebDriver APIs available in Selenium ?
- Firefox Driver , Gecko driver , internet explorer driver , Chrome driver , HTML driver , Opera Driver ,Safari driver,
Android Driver , Iphone driver , EventFiring WebDriver.


21) which is fastest driver ? -> HTMLUnitDriver bcz it does not execute tests in the browser.

22) Selenium WebD supported languages - java , c# , python , rubt, perl , PHP

23 ) supporting OS - windows , linux , apple

24) What are the open source frameworks supported by selenium webdriver ?  Junit , TestNG , Cucumber , JBheave

25) what are the locators available in selenium ?
-ID
-ClassName
-Name
-TagName
-LinkText
-PartialLinkText
-Xpath
-CSS Selector

26) What is Xpath ?
Xpath is used to locate elements . Using Xpath we could navigate through elements and attributes in an XML document to
locate web elements such as textbox, button , checkbox, Image etc in web page .

XPath is a query language designed to navigate through elements and attributes in XML documents.
In web development, XPath is utilized to locate and interact with elements within an HTML document's structure.
 This capability is particularly beneficial for web scraping and automated testing, as it allows precise identification
 of web elements based on various criteria such as attributes, text content, and hierarchical relationships.
Xpath=//tagname[@attribute='value']

Where:
tagname: The name of the HTML tag you wish to target.
@attribute: The attribute within the tag.
'value': The specific value of the attribute.
Example:
To locate an input field with the attribute id equal to username:

Xpath=//input[@id='username']

This expression selects all <input> elements with an id attribute of 'username'.

27 ) diff between "/" and "//"?
Single slash is used to create xpath with absolute path i.e. the Xpath would be created to start selection from the
document node/Start node.

Double slash is used to create Xpath with relative path i.e. the Xpath would be created to start selection from anywhere
within the document.

28 ) Absolute path and Relative Path?
Absolute Xpath starts from the root node and ends with desired dependent elements node. It starts with top HTML node and
ends with input node . It starts with a single forward slash (/) as shown below-
/html/body/div[3]/div[1]/form/table/tbody/tr[1]/td/input

Relative Xpath starts from any node in between the HTML page to the current elements node(last node of the element).It
starts with a double forward slash (//) as shown below -
//input[@id='email']


29) What is diff between Assert and Verify in Selenium ?
Assert - In simple words , if the assert condition is true then the program control will execute the next test step but if
thr program condition is false ,the execution will stop and further test step will not be executed.

Verify - In simple words,there wont be any halt in the test execution even though the verify conditions is true of false.

30) Soft Assert and Hard Assert?
Soft Assert - Soft Assert collects errors during @Test .Soft Assert does not throw an exception when an assert fails and
would continue with the next step after the assert statement . (Logo)
      Soft Assertion continues with test execution even if the assertion conditions fails. it does not throw any error when
      the assertion condition fails but continues with the next step of the test.

Hard Assert - Hard assert throws an AssertException immediately when an assert statement fails and test suite continue with
next @Test.  (Login)
  Hard assertion does not continue with execution until the assertion condition is True.
  Hard assertion usually throw an assertion error whenever an assertion condition fails.
  The test case will be immediately marked as failed when a hard assertion condition fails.
  by default assert in selenium WD are hard asserts.

31) What are the verification points available in Selenium ?
In selenium IDE , we use selenese verify and assert commands as verification points .In selenium web driver , there is no
built-in features for verification points. It totally depends on our coding style. some of the verification points are -
to check for page title
to check for certain text
to check for certain elements like text box, button , drop down

32) How to launch a browser using Selenium WD?
-> Webdriver is an interface , we create Object of Webdriver interface.
To launch Firefox Driver -  WebDriver driver = new FirefoxDriver();     gecko driver after.3.x version
  "WD" is an interface and we are creating an Object of type Webdriver instantiating an Object of
  firefox driver class .

To launch Chrome Driver - WebDriver driver = new ChromeDriver();        dynamic polymorphism
To launch Internet Explorer Driver - WebDriver driver = new InternetExplorerDriver();
Safari                       (IMP)

33) Is the firefox driver class or an interface ? IMP
It is a java class , and it implements the webdriver interface .

34) what is super interface of webdriver?
SearchContext

35) Explain line 146 ->  "WD" is an interface and we are creating an Object of type Webdriver instantiating an Object of
firefox driver class .

36) We do create a reference variable ' driver ' of type WebDriver -> WebDriver driver = new ChromeDriver();
instead of creating -> ChromeDriver driver = new ChromeDriver();   what is the purpose of doing this way?
-> If we create a reference variable driver of type WD then we could use the same driver variable to work with any browser
of our choice such as IEDriver, SafariDriver etc.

37) what are the diff  you have faced in selenium WD?
- WebDriverException
- TimeoutException
- NoAlertPresentException
- NoSuchWindowException
- NoSuchElementException

 - Element Not Visible Exception
 While running Selenium tests, it is common for testers to get the message “Element Not Visible Exception“.
 This appears when a particular web element with which WebDriver has to interact, is delayed in its loading.
 To prevent this Exception, Selenium Wait Commands must be used.

* - staleElementReferenceException   HTML DOM video   -->  If you try to perform an action on an element you identified
  on a web page, but the page is refreshed automatically, you might get a StaleElementReferenceException.
  Causes
  The HTML element has been deleted or recreated
  The page has been refreshed
  The user has navigated to a different page
  The element has been replaced by a similar element
  The page uses a client-side framework like React or Vue

  How to handle
  Use WebDriverWait to wait for the element to be available
  Wrap interactions in a try-catch block
  Update the reference of the web element each time

- IllegalStateException -  without setProperty() if we launch driver then it comes.

38) How to login into any site if it is showing any authentication pop-up for Username and Password?
- to do this  we pass Username and password with the URL - http://username:password@url
example -http://admin:admin123@xyz.com

39) what are the types of waits available in selenium WD?  (IMP)
- we could see three types such as
Implicit waits ,
Explicit Waits ,
Fluent Waits.
PageLoadTimeOut
Thread.sleep()

static wait is thread.sleep(1000);

40) - 1) IMPLICIT Waits :- tells to the WD to wait for a certain amount of time before it throws an exception.Once we set the
time, WD will wait for the element based on the time we set before it throws an exception. The default setting is 0. We
need to set some wait time to make WD to wait for the required time . (Global wait )
If one sets an implicit wait command, then the browser will wait for the same time frame before loading every web
 element. This causes an unnecessary delay in executing the test script.

2) EXPLICIT Waits :-
Explicit wait in Selenium is a synchronization mechanism that allows the WebDriver to wait for a specific condition
 to occur before proceeding with the next step in the code. Unlike Implicit waits, which apply globally,
  explicit waits are applied only to specific elements or conditions, making them more flexible and precise.

Setting Explicit Wait is important in cases where there are certain elements that naturally take more time to load.
Explicit wait is more intelligent, but can only be applied for specified elements.

    Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    wait.until(d -> revealed.isDisplayed());

42) Fluent Waits : - FluentWait can define the maximum amount of time to wait for a specific condition and frequency with
which to check the condition before throwing an "ElementNotVisbleException" exception.

41) What is WD Wait in selenium WD?
WebDriverWait is applied on a certain element with defined expected condition and time. This wait is only applied to the
specified element. this wait can also throw an exception when an element is not found.

43) How to input text in the text box using Selenium WD?
- by using sendKeys() method
- WebDriver driver = new ChromeDriver();
- driver.get("https://www.gmail.com");
- driver.findElement(By.xpath("xpath")).sendKeys("s/w testing material website");

WebElement email = driver.findElement(By.id(“email”)); - Finds the “email” text using the ID locator
email.sendKeys(“abcd.efgh@gmail.com”); - Enters text into the URL field
WebElement password = driver.findElement(By.id(“Password”)); - Finds the “password” text using the ID locator
password.sendKeys(“abcdefgh123”); - Enters text into the password field

44) how to input text in the text box without calling the sendKeys()?
- //to initialize js object
JavascriptExecutor Js= (JavascriptExecutor)driver;
//to enter username
Js.executeScript("document.getElementByID('User').value='s/w testing material website.com'");
Js.executeScript("document.getElementByID('Pass').value='tester'");

45) by clear method we can clear the text from the textbox
46) by using getText() method we can get a text of a web element
47) by using getAttribute(value) method we can get a attribute value.
48) by linkText - hyperlink
49) by submit method we can submit a form.
50) by keys.enter we can enter key on a text box in selenium WD.

51) by using Thread.sleep(long milis)method we can pause

52) Is selenium server needed to run selenium WD scripts?
when we are distributing our SWD scripts to execute using selenium Grid, we need to use selenium server.

53) what happens if I run this cmd? -> driver.get("www.google.com");
An exception is thrown.. we need to pass http protocol within driver.get() method.
--driver.get("http://www.google.com");

54) alternative method to driver.get () method is driver.navigate.to("url");

55) diff between driver.get() and driver.navigate() method?
- driver.get() -> to open an URL and it will wait till the whole page gets loaded.
- driver.navigate() -> to navigate to an URL and it will not wait till the whole page gets loaded.

56) can I navigate back and forth in browser in selenium WD?
-> We use navigate interface to do navigate back and forth in a browser. It has methods to move back and forward as well
as to refresh a page.
-> driver.navigate().forward() - to navigate to the next web page with reference to the browsers history.
-> driver.navigate().back() - takes back to the previous page
-> driver.navigate.refresh() - to refresh the current web page thereby reloading all the web elements.
-> driver.navigate.to("url") - to launch a new web browser window and navigate to the specified url.

58) by driver.getCurrentURL()  we can fetch the current page URL.

59) by driver.manage().window().maximize(); -  we can maximize browser window.

60) deleteAllCookies() method- driver.manage().deleteAllCookies();

61) What are the ways to refresh a browser using SWD?
-> There are multiple ways to refresh a page in selenium,
   Using driver.navigate().refresh() cmd
   Using driver.get("URL") on the current URL or using driver.getCurrentUrl()
   Using drier.navigate().to("URL") on the current URL or driver.navigate().to(driver.getCurrentUrl());
   Using sendKeys(Keys.F5) on any textbox on the webpage

62) What is diff between driver.getWindowHandle() and driver.getWindowHandles()?
-> driver.getWindowHandle() -> It returns a handle of the current page (a unique identifier)
   driver.getWindowHandles() -> It returns a set of handles of the all pages available.

   In Selenium, getWindowHandle() is a method that returns the handle of the current active window.
   It's useful for keeping track of the original window so you can return to it after switching to other windows.
   Syntax - String currentWindowHandle = driver.getWindowHandle().
   How it works
   getWindowHandle() returns a unique ID of the current window.
   This ID identifies the window within the driver instance.
   getWindowHandle() returns a value of the String type.
   When to use
   getWindowHandle() is useful when you need to identify the current window for immediate actions.
   It's especially helpful when you have to keep track of the original window after switching to other window

   getWindowHandles() returns the handles of all the windows opened by the web driver.
   switchTo().window() switches the WebDriver's focus to a specific window.

63) diff bet driver.close() and driver.quit() methods?
->  driver.close() -> to close current webDriver instance
    driver.quit() -> to close all opened WebDriver instances.

64) diff between driver.findElement() and driver.findElements()?
-> driver.findElement() ->findElement returns a first single WebElement based on the locator passed as parameter.whereas
  driver.findElements() returns a list of all webElements, all satisfying the locator value passed.
 Syntax- driver.findElement() -->> WebElement textbox = driver.findElement(By.id("textBoxLocator"));
        driver.findElements() -->> List<WebElement> elements = driver.findElements(By.id("value"));
Another diff between the two is if no element is found then findElement() throws NoSuchElementException whereas findElements()
return a list of 0 elements.

65) How to find whether an element is displayed on the webPage?
- > WD facilitates the user with the following methods to check the visibility of the web elements. These web elements can
be button, drop boxes, checkboxes, radio buttons, labels etc.
1 -> isDisplayed() -  driver.findElement(By.xpath("xpath")).isDisplayed();
2 -> boolean elePresent- driver
3 -> isSelected()
4 -> isEnabled()

# isDisplayed() is the method used to verify the presence of a web element within the web page. the method returns "true"
value if the specified web element is present on the web page and a " false" value if the web element is not present
on web page.
isDisplayed is capable to check for the presence of all kinds of web elements available.

isEnabled is the method used to verify if the web element is enabled or disabled within the web page.
isEnabled is primarily used with buttons.

isSelected() is the method used to verify if the web elements is selected or not.
isSelected is predominantly used with radio button , dropdowns and checkboxes.

66) How to select a value in a dropdown?
->By using select class
  WebElement mySelectElement= driver.findElement(By.name("dropdown"));
  Select dropdown - new Select(mySelectElement);
  dropdown.selectByVisibleText(Text);
  dropdown.selectByIndex(Index);
  dropdown.selectByIndex(Value);

67) how to capture screenshot in SWD?
-> TakeScreenshot interface.   ashot utility

68) How to mouse hover on a web element using WD?
-> By using Actions class
WebElement ele= driver.findElement(By.xpath("xpath"));
Actions actions = new Actions(driver);
actions.moveToElement(ele).build().perform();

69) How can we handle web based pop up?
-> To handle alerts popups we need to do switch to the alert window and call selenium WD Alert API methods.

70) How can we handle windows based popup?
-> Selenium doesn't support windows based applications.It is an automation testing tool which supports only web applications
testing. We could handle windows based popups in selenium using some third party tools such as AutoIT, Robot class.

71) How to handle hidden elements in SWD? ->>> It is one of the most important selenium WD questions.
-> * Handling hidden elements in Selenium WebDriver requires specific techniques because Selenium cannot directly interact
with elements that are not visible on the web page. Here are some methods to handle hidden elements effectively-

-> We can handle hidden elements by using javascript executor.
(JavaScriptExecutor(driver)).executeScript("document.getElementsByClassName(ElementLocator).click();");
-> For advanced interactions, leverage JavaScript to directly manipulate DOM elements and access properties that
  might not be readily available through Selenium.

✅ 1. Verify Element Visibility
Before interacting with an element, check whether it is displayed using:
WebElement element = driver.findElement(By.id("elementId"));
if (element.isDisplayed()) {
    element.click();
} else {
    System.out.println("Element is hidden and cannot be clicked.");
}
✅ 2. Use JavaScript Executor
JavaScript can interact with hidden elements by manipulating the DOM directly.
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement hiddenElement = driver.findElement(By.id("elementId"));
js.executeScript("arguments[0].click();", hiddenElement);
This is useful for elements that are hidden using display: none or visibility: hidden.

✅ 3. Modify Element Properties
You can remove or change the hidden attribute using JavaScript:
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement hiddenElement = driver.findElement(By.id("elementId"));
js.executeScript("arguments[0].style.display='block';", hiddenElement);
hiddenElement.click();
✅ 4. Use Actions Class for Hover
Some elements become visible upon mouse hover. Use Actions to simulate this:
Actions actions = new Actions(driver);
WebElement menu = driver.findElement(By.id("menuId"));
actions.moveToElement(menu).perform();
WebElement subMenu = driver.findElement(By.id("submenuId"));
subMenu.click();
✅ 5. Handle Shadow DOM
If elements are hidden inside a Shadow DOM, use executeScript to access them:
JavascriptExecutor js = (JavascriptExecutor) driver;
WebElement shadowHost = driver.findElement(By.cssSelector("#shadowHost"));
WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
WebElement hiddenElement = shadowRoot.findElement(By.cssSelector("#hiddenElement"));
hiddenElement.click();
✅ 6. Use Explicit Wait
Sometimes elements are not hidden but take time to become visible. Use WebDriverWait:
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementId")));
element.click();
✅ 7. Handle Hidden Elements with CSS or XPath
Use CSS or XPath to locate hidden elements:
WebElement hiddenElement = driver.findElement(By.cssSelector("#elementId[style*='display:none']"));
System.out.println("Hidden Element Text: " + hiddenElement.getText());
🚀 Best Practices to Follow
Avoid using JavaScript for all actions unless necessary, as it bypasses the normal browser behavior.
Ensure element visibility before interaction to reduce flakiness.
Use explicit waits where applicable instead of relying on hard waits (Thread.sleep()).
Debug using Developer Tools to check if the element is actually hidden or not.


72) How can you find Broken links in web page using SWD? --->>>IMP
-->>  A broken link, also often called a dead link, is one that does not work i.e. does not redirect to the webpage
it is meant to. This usually occurs because the website or particular web page is down or does not exist.
When someone clicks on a broken link, an error message is displayed.
      Broken links may exist due to some kind of server error, which, in turn, causes the corresponding page to
malfunction and not be displayed. A valid URL will have a 200 HTTP status code.  Broken links, which are essentially
invalid HTTP requests have 400 and 500 status codes.
 The 400 status code refers to a client-side error, while the 500 status code usually points to a server response error.

To find broken links in Selenium, follow the instructions below.

Using the <a> (anchor) tag, collect all of the links on a web page.
For each link, send an HTTP request.
Make that the HTTP response code is correct.
Based on the HTTP response code, determine whether the link is genuine or not.
Repeat the procedure for all of the links that were captured in the first step.


73) How to find more then one web element in the list?
-> to store the list ->             List<WebElement> eleList = driver.findElements(By.xpath("xpath"));
-> to fetch the size of the list -> int listSize = eleList.size();
                                    for(int=0;i<listSize;i++){
   clicking on each link            links.get(i).click();
navigating back to the previous
page that stores the links          driver.navigate().back();


75) how do you read test data from excels?
-> Test data can efficiently be read from excel using JXL or POI API.

76) + 77) List some scenarios which we cannot automate using SWD?
-> BitMap comparison is not possible using SWD
   Automating Captcha is not possible
   We cannot read bar code using SWD
   windows OS based popups
   third party calenders/elements
   image
   word/PDF

78) What is Object Repository in SWD?
-> Object repo is used to store element values in a centralized location instead of hard coding them within the scripts.
We do create a property file to store all the elements and these property files act as an object repo in SWD.

79) HOw can you use recovery scenario in SWD?
-> By using "try catch block" within SWD Java tests.
try{
driver.get("www.xyz.com");}
Catch(Exception e){
System.out.println(e.getMessage());}

80) how to upload a file in SWD?
- > by using sendKeys method and Using AutoIT script.   sendKeys(c:\\tests\dipali.jpg);

81) download file - > AutoIT

85) resize a browser - > diamensions class
 Diamensions d = new Diamensions (480,620);
 driver.manage().window().setSize(d);

86) Scroll webpage down or up using SWD?
-> Javascript scrollBy() methods scrolls the document by the specified number of pixels.

87) How to perform right click Action in SWd?
-> Actions class in SWD to do right click action.
  action.contextClick(driver.findElement(By.xpath()).build().perform();

88) double click    -> action.doubleClick(driver.findElement(By.xpath()).build().perform();

89) Highlights Element using SWD ? -> by using javascript executor interface

90) In Selenium testing with TestNG, common annotations include @BeforeSuite, @AfterSuite, @BeforeTest, @AfterTest,
@BeforeClass, @AfterClass, @BeforeMethod, @AfterMethod, @Test, @DataProvider, @Parameters, @Listeners, and @Ignore.
    Here's a more detailed breakdown:
    Core Annotations:
    @Test: Marks a method as a test case.
    @BeforeSuite: Executes before the entire test suite.
    @AfterSuite: Executes after the entire test suite.
    @BeforeTest: Executes before the execution of test methods within a <test> tag in the TestNG XML file.
    @AfterTest: Executes after the execution of test methods within a <test> tag in the TestNG XML file.
    @BeforeClass: Executes before the first test method in a class.
    @AfterClass: Executes after all test methods in a class have been run.
    @BeforeMethod: Executes before each test method annotated with @Test.
    @AfterMethod: Executes after each test method annotated with @Test.

    Data and Parameterization:
    @DataProvider: Supplies data to test methods, allowing them to be executed multiple times with different data sets.
    @Parameters: Allows passing parameters to test methods from the TestNG XML file.

    Other Useful Annotations:
    @Listeners: Specifies listener classes that can intervene in test events(e.g., start of a test, failure, end of the suite).
    @Ignore: Instructs TestNG to skip the execution of a test method.
    @Factory: Helps in the dynamic execution of test cases, allowing parameters to be passed to the entire test class at runtime.
    @BeforeGroups and @AfterGroups: Run methods before and after specific groups of tests, respectively.