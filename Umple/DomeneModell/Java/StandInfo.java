/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 52 "model.ump"
// line 135 "model.ump"
public class StandInfo
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandInfo Attributes
  private int id;
  private String name;
  private String imageUrl;
  private String epostsadmin;
  private String pin;

  //StandInfo Associations
  private DBHandler dBHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StandInfo(int aId, String aName, String aImageUrl, String aEpostsadmin, String aPin, DBHandler aDBHandler)
  {
    id = aId;
    name = aName;
    imageUrl = aImageUrl;
    epostsadmin = aEpostsadmin;
    pin = aPin;
    boolean didAddDBHandler = setDBHandler(aDBHandler);
    if (!didAddDBHandler)
    {
      throw new RuntimeException("Unable to create standInfo due to dBHandler");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setId(int aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setImageUrl(String aImageUrl)
  {
    boolean wasSet = false;
    imageUrl = aImageUrl;
    wasSet = true;
    return wasSet;
  }

  public boolean setEpostsadmin(String aEpostsadmin)
  {
    boolean wasSet = false;
    epostsadmin = aEpostsadmin;
    wasSet = true;
    return wasSet;
  }

  public boolean setPin(String aPin)
  {
    boolean wasSet = false;
    pin = aPin;
    wasSet = true;
    return wasSet;
  }

  public int getId()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getImageUrl()
  {
    return imageUrl;
  }

  public String getEpostsadmin()
  {
    return epostsadmin;
  }

  public String getPin()
  {
    return pin;
  }
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
      existingDBHandler.removeStandInfo(this);
    }
    dBHandler.addStandInfo(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    DBHandler placeholderDBHandler = dBHandler;
    this.dBHandler = null;
    if(placeholderDBHandler != null)
    {
      placeholderDBHandler.removeStandInfo(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "name" + ":" + getName()+ "," +
            "imageUrl" + ":" + getImageUrl()+ "," +
            "epostsadmin" + ":" + getEpostsadmin()+ "," +
            "pin" + ":" + getPin()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "dBHandler = "+(getDBHandler()!=null?Integer.toHexString(System.identityHashCode(getDBHandler())):"null");
  }
}