/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 17 "model.ump"
// line 99 "model.ump"
public class Login extends Servlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Login Associations
  private LoginUtil loginUtil;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Login(DBHandler aDBHandler, LoginUtil aLoginUtil)
  {
    super(aDBHandler);
    if (aLoginUtil == null || aLoginUtil.getLogin() != null)
    {
      throw new RuntimeException("Unable to create Login due to aLoginUtil");
    }
    loginUtil = aLoginUtil;
  }

  public Login(DBHandler aDBHandler, JavaEmail aJavaEmailForLoginUtil)
  {
    super(aDBHandler);
    loginUtil = new LoginUtil(this, aJavaEmailForLoginUtil);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public LoginUtil getLoginUtil()
  {
    return loginUtil;
  }

  public void delete()
  {
    LoginUtil existingLoginUtil = loginUtil;
    loginUtil = null;
    if (existingLoginUtil != null)
    {
      existingLoginUtil.delete();
    }
    super.delete();
  }

}