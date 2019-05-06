/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 34 "model.ump"
// line 115 "model.ump"
public class RegistrerStand extends Servlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RegistrerStand Associations
  private JavaEmail javaEmail;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RegistrerStand(DBHandler aDBHandler, JavaEmail aJavaEmail)
  {
    super(aDBHandler);
    if (aJavaEmail == null || aJavaEmail.getRegistrerStand() != null)
    {
      throw new RuntimeException("Unable to create RegistrerStand due to aJavaEmail");
    }
    javaEmail = aJavaEmail;
  }

  public RegistrerStand(DBHandler aDBHandler, LoginUtil aLoginUtilForJavaEmail)
  {
    super(aDBHandler);
    javaEmail = new JavaEmail(this, aLoginUtilForJavaEmail);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public JavaEmail getJavaEmail()
  {
    return javaEmail;
  }

  public void delete()
  {
    JavaEmail existingJavaEmail = javaEmail;
    javaEmail = null;
    if (existingJavaEmail != null)
    {
      existingJavaEmail.delete();
    }
    super.delete();
  }

}