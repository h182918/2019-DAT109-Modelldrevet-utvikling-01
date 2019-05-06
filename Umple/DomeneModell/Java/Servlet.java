/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 13 "model.ump"
// line 94 "model.ump"
public class Servlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Servlet Associations
  private DBHandler dBHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Servlet(DBHandler aDBHandler)
  {
    boolean didAddDBHandler = setDBHandler(aDBHandler);
    if (!didAddDBHandler)
    {
      throw new RuntimeException("Unable to create servlet due to dBHandler");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public DBHandler getDBHandler()
  {
    return dBHandler;
  }
  /* Code from template association_SetOneToMany */
  public boolean setDBHandler(DBHandler aDBHandler)
  {
    boolean wasSet = false;
    if (aDBHandler == null)
    {
      return wasSet;
    }

    DBHandler existingDBHandler = dBHandler;
    dBHandler = aDBHandler;
    if (existingDBHandler != null && !existingDBHandler.equals(aDBHandler))
    {
      existingDBHandler.removeServlet(this);
    }
    dBHandler.addServlet(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    DBHandler placeholderDBHandler = dBHandler;
    this.dBHandler = null;
    if(placeholderDBHandler != null)
    {
      placeholderDBHandler.removeServlet(this);
    }
  }

}