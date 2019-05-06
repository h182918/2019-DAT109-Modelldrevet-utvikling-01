/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 48 "model.ump"
// line 130 "model.ump"
public class LoginUtil
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LoginUtil Associations
  private Login login;
  private JavaEmail javaEmail;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LoginUtil(Login aLogin, JavaEmail aJavaEmail)
  {
    if (aLogin == null || aLogin.getLoginUtil() != null)
    {
      throw new RuntimeException("Unable to create LoginUtil due to aLogin");
    }
    login = aLogin;
    if (aJavaEmail == null || aJavaEmail.getLoginUtil() != null)
    {
      throw new RuntimeException("Unable to create LoginUtil due to aJavaEmail");
    }
    javaEmail = aJavaEmail;
  }

  public LoginUtil(DBHandler aDBHandlerForLogin, RegistrerStand aRegistrerStandForJavaEmail)
  {
    login = new Login(aDBHandlerForLogin, this);
    javaEmail = new JavaEmail(aRegistrerStandForJavaEmail, this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Login getLogin()
  {
    return login;
  }
  /* Code from template association_GetOne */
  public JavaEmail getJavaEmail()
  {
    return javaEmail;
  }

  public void delete()
  {
    Login existingLogin = login;
    login = null;
    if (existingLogin != null)
    {
      existingLogin.delete();
    }
    JavaEmail existingJavaEmail = javaEmail;
    javaEmail = null;
    if (existingJavaEmail != null)
    {
      existingJavaEmail.delete();
    }
  }

}