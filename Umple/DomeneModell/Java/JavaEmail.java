/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 75 "model.ump"
// line 140 "model.ump"
public class JavaEmail
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //JavaEmail Associations
  private RegistrerStand registrerStand;
  private LoginUtil loginUtil;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public JavaEmail(RegistrerStand aRegistrerStand, LoginUtil aLoginUtil)
  {
    if (aRegistrerStand == null || aRegistrerStand.getJavaEmail() != null)
    {
      throw new RuntimeException("Unable to create JavaEmail due to aRegistrerStand");
    }
    registrerStand = aRegistrerStand;
    if (aLoginUtil == null || aLoginUtil.getJavaEmail() != null)
    {
      throw new RuntimeException("Unable to create JavaEmail due to aLoginUtil");
    }
    loginUtil = aLoginUtil;
  }

  public JavaEmail(DBHandler aDBHandlerForRegistrerStand, Login aLoginForLoginUtil)
  {
    registrerStand = new RegistrerStand(aDBHandlerForRegistrerStand, this);
    loginUtil = new LoginUtil(aLoginForLoginUtil, this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public RegistrerStand getRegistrerStand()
  {
    return registrerStand;
  }
  /* Code from template association_GetOne */
  public LoginUtil getLoginUtil()
  {
    return loginUtil;
  }

  public void delete()
  {
    RegistrerStand existingRegistrerStand = registrerStand;
    registrerStand = null;
    if (existingRegistrerStand != null)
    {
      existingRegistrerStand.delete();
    }
    LoginUtil existingLoginUtil = loginUtil;
    loginUtil = null;
    if (existingLoginUtil != null)
    {
      existingLoginUtil.delete();
    }
  }

}