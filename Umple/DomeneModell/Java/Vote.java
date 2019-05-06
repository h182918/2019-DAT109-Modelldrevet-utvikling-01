/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 61 "model.ump"
// line 147 "model.ump"
public class Vote
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vote Attributes
  private int id;
  private String username;
  private int stand;
  private int score;

  //Vote Associations
  private DBHandler dBHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vote(int aId, String aUsername, int aStand, int aScore, DBHandler aDBHandler)
  {
    id = aId;
    username = aUsername;
    stand = aStand;
    score = aScore;
    boolean didAddDBHandler = setDBHandler(aDBHandler);
    if (!didAddDBHandler)
    {
      throw new RuntimeException("Unable to create vote due to dBHandler");
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

  public boolean setUsername(String aUsername)
  {
    boolean wasSet = false;
    username = aUsername;
    wasSet = true;
    return wasSet;
  }

  public boolean setStand(int aStand)
  {
    boolean wasSet = false;
    stand = aStand;
    wasSet = true;
    return wasSet;
  }

  public boolean setScore(int aScore)
  {
    boolean wasSet = false;
    score = aScore;
    wasSet = true;
    return wasSet;
  }

  public int getId()
  {
    return id;
  }

  public String getUsername()
  {
    return username;
  }

  public int getStand()
  {
    return stand;
  }

  public int getScore()
  {
    return score;
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
      existingDBHandler.removeVote(this);
    }
    dBHandler.addVote(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    DBHandler placeholderDBHandler = dBHandler;
    this.dBHandler = null;
    if(placeholderDBHandler != null)
    {
      placeholderDBHandler.removeVote(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "id" + ":" + getId()+ "," +
            "username" + ":" + getUsername()+ "," +
            "stand" + ":" + getStand()+ "," +
            "score" + ":" + getScore()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "dBHandler = "+(getDBHandler()!=null?Integer.toHexString(System.identityHashCode(getDBHandler())):"null");
  }
}