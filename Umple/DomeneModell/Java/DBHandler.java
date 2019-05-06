/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/


import java.util.*;

// line 2 "model.ump"
// line 83 "model.ump"
public class DBHandler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DBHandler Attributes
  private String url;
  private String user;
  private String password;

  //DBHandler Associations
  private List<Servlet> servlets;
  private List<Vote> votes;
  private List<StandInfo> standInfos;
  private List<StandOverview> standOverviews;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DBHandler(String aUrl, String aUser, String aPassword)
  {
    url = aUrl;
    user = aUser;
    password = aPassword;
    servlets = new ArrayList<Servlet>();
    votes = new ArrayList<Vote>();
    standInfos = new ArrayList<StandInfo>();
    standOverviews = new ArrayList<StandOverview>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setUrl(String aUrl)
  {
    boolean wasSet = false;
    url = aUrl;
    wasSet = true;
    return wasSet;
  }

  public boolean setUser(String aUser)
  {
    boolean wasSet = false;
    user = aUser;
    wasSet = true;
    return wasSet;
  }

  public boolean setPassword(String aPassword)
  {
    boolean wasSet = false;
    password = aPassword;
    wasSet = true;
    return wasSet;
  }

  public String getUrl()
  {
    return url;
  }

  public String getUser()
  {
    return user;
  }

  public String getPassword()
  {
    return password;
  }
  /* Code from template association_GetMany */
  public Servlet getServlet(int index)
  {
    Servlet aServlet = servlets.get(index);
    return aServlet;
  }

  public List<Servlet> getServlets()
  {
    List<Servlet> newServlets = Collections.unmodifiableList(servlets);
    return newServlets;
  }

  public int numberOfServlets()
  {
    int number = servlets.size();
    return number;
  }

  public boolean hasServlets()
  {
    boolean has = servlets.size() > 0;
    return has;
  }

  public int indexOfServlet(Servlet aServlet)
  {
    int index = servlets.indexOf(aServlet);
    return index;
  }
  /* Code from template association_GetMany */
  public Vote getVote(int index)
  {
    Vote aVote = votes.get(index);
    return aVote;
  }

  public List<Vote> getVotes()
  {
    List<Vote> newVotes = Collections.unmodifiableList(votes);
    return newVotes;
  }

  public int numberOfVotes()
  {
    int number = votes.size();
    return number;
  }

  public boolean hasVotes()
  {
    boolean has = votes.size() > 0;
    return has;
  }

  public int indexOfVote(Vote aVote)
  {
    int index = votes.indexOf(aVote);
    return index;
  }
  /* Code from template association_GetMany */
  public StandInfo getStandInfo(int index)
  {
    StandInfo aStandInfo = standInfos.get(index);
    return aStandInfo;
  }

  public List<StandInfo> getStandInfos()
  {
    List<StandInfo> newStandInfos = Collections.unmodifiableList(standInfos);
    return newStandInfos;
  }

  public int numberOfStandInfos()
  {
    int number = standInfos.size();
    return number;
  }

  public boolean hasStandInfos()
  {
    boolean has = standInfos.size() > 0;
    return has;
  }

  public int indexOfStandInfo(StandInfo aStandInfo)
  {
    int index = standInfos.indexOf(aStandInfo);
    return index;
  }
  /* Code from template association_GetMany */
  public StandOverview getStandOverview(int index)
  {
    StandOverview aStandOverview = standOverviews.get(index);
    return aStandOverview;
  }

  public List<StandOverview> getStandOverviews()
  {
    List<StandOverview> newStandOverviews = Collections.unmodifiableList(standOverviews);
    return newStandOverviews;
  }

  public int numberOfStandOverviews()
  {
    int number = standOverviews.size();
    return number;
  }

  public boolean hasStandOverviews()
  {
    boolean has = standOverviews.size() > 0;
    return has;
  }

  public int indexOfStandOverview(StandOverview aStandOverview)
  {
    int index = standOverviews.indexOf(aStandOverview);
    return index;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfServlets()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Servlet addServlet()
  {
    return new Servlet(this);
  }

  public boolean addServlet(Servlet aServlet)
  {
    boolean wasAdded = false;
    if (servlets.contains(aServlet)) { return false; }
    DBHandler existingDBHandler = aServlet.getDBHandler();
    boolean isNewDBHandler = existingDBHandler != null && !this.equals(existingDBHandler);
    if (isNewDBHandler)
    {
      aServlet.setDBHandler(this);
    }
    else
    {
      servlets.add(aServlet);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeServlet(Servlet aServlet)
  {
    boolean wasRemoved = false;
    //Unable to remove aServlet, as it must always have a dBHandler
    if (!this.equals(aServlet.getDBHandler()))
    {
      servlets.remove(aServlet);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addServletAt(Servlet aServlet, int index)
  {  
    boolean wasAdded = false;
    if(addServlet(aServlet))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfServlets()) { index = numberOfServlets() - 1; }
      servlets.remove(aServlet);
      servlets.add(index, aServlet);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveServletAt(Servlet aServlet, int index)
  {
    boolean wasAdded = false;
    if(servlets.contains(aServlet))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfServlets()) { index = numberOfServlets() - 1; }
      servlets.remove(aServlet);
      servlets.add(index, aServlet);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addServletAt(aServlet, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfVotes()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Vote addVote(int aId, String aUsername, int aStand, int aScore)
  {
    return new Vote(aId, aUsername, aStand, aScore, this);
  }

  public boolean addVote(Vote aVote)
  {
    boolean wasAdded = false;
    if (votes.contains(aVote)) { return false; }
    DBHandler existingDBHandler = aVote.getDBHandler();
    boolean isNewDBHandler = existingDBHandler != null && !this.equals(existingDBHandler);
    if (isNewDBHandler)
    {
      aVote.setDBHandler(this);
    }
    else
    {
      votes.add(aVote);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeVote(Vote aVote)
  {
    boolean wasRemoved = false;
    //Unable to remove aVote, as it must always have a dBHandler
    if (!this.equals(aVote.getDBHandler()))
    {
      votes.remove(aVote);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addVoteAt(Vote aVote, int index)
  {  
    boolean wasAdded = false;
    if(addVote(aVote))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVotes()) { index = numberOfVotes() - 1; }
      votes.remove(aVote);
      votes.add(index, aVote);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveVoteAt(Vote aVote, int index)
  {
    boolean wasAdded = false;
    if(votes.contains(aVote))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfVotes()) { index = numberOfVotes() - 1; }
      votes.remove(aVote);
      votes.add(index, aVote);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addVoteAt(aVote, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStandInfos()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public StandInfo addStandInfo(int aId, String aName, String aImageUrl, String aEpostsadmin, String aPin)
  {
    return new StandInfo(aId, aName, aImageUrl, aEpostsadmin, aPin, this);
  }

  public boolean addStandInfo(StandInfo aStandInfo)
  {
    boolean wasAdded = false;
    if (standInfos.contains(aStandInfo)) { return false; }
    DBHandler existingDBHandler = aStandInfo.getDBHandler();
    boolean isNewDBHandler = existingDBHandler != null && !this.equals(existingDBHandler);
    if (isNewDBHandler)
    {
      aStandInfo.setDBHandler(this);
    }
    else
    {
      standInfos.add(aStandInfo);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStandInfo(StandInfo aStandInfo)
  {
    boolean wasRemoved = false;
    //Unable to remove aStandInfo, as it must always have a dBHandler
    if (!this.equals(aStandInfo.getDBHandler()))
    {
      standInfos.remove(aStandInfo);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStandInfoAt(StandInfo aStandInfo, int index)
  {  
    boolean wasAdded = false;
    if(addStandInfo(aStandInfo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStandInfos()) { index = numberOfStandInfos() - 1; }
      standInfos.remove(aStandInfo);
      standInfos.add(index, aStandInfo);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStandInfoAt(StandInfo aStandInfo, int index)
  {
    boolean wasAdded = false;
    if(standInfos.contains(aStandInfo))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStandInfos()) { index = numberOfStandInfos() - 1; }
      standInfos.remove(aStandInfo);
      standInfos.add(index, aStandInfo);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStandInfoAt(aStandInfo, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfStandOverviews()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public StandOverview addStandOverview(StandInfo aStand, double aAverage, int aTotalscore)
  {
    return new StandOverview(aStand, aAverage, aTotalscore, this);
  }

  public boolean addStandOverview(StandOverview aStandOverview)
  {
    boolean wasAdded = false;
    if (standOverviews.contains(aStandOverview)) { return false; }
    DBHandler existingDBHandler = aStandOverview.getDBHandler();
    boolean isNewDBHandler = existingDBHandler != null && !this.equals(existingDBHandler);
    if (isNewDBHandler)
    {
      aStandOverview.setDBHandler(this);
    }
    else
    {
      standOverviews.add(aStandOverview);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeStandOverview(StandOverview aStandOverview)
  {
    boolean wasRemoved = false;
    //Unable to remove aStandOverview, as it must always have a dBHandler
    if (!this.equals(aStandOverview.getDBHandler()))
    {
      standOverviews.remove(aStandOverview);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addStandOverviewAt(StandOverview aStandOverview, int index)
  {  
    boolean wasAdded = false;
    if(addStandOverview(aStandOverview))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStandOverviews()) { index = numberOfStandOverviews() - 1; }
      standOverviews.remove(aStandOverview);
      standOverviews.add(index, aStandOverview);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveStandOverviewAt(StandOverview aStandOverview, int index)
  {
    boolean wasAdded = false;
    if(standOverviews.contains(aStandOverview))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfStandOverviews()) { index = numberOfStandOverviews() - 1; }
      standOverviews.remove(aStandOverview);
      standOverviews.add(index, aStandOverview);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addStandOverviewAt(aStandOverview, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=servlets.size(); i > 0; i--)
    {
      Servlet aServlet = servlets.get(i - 1);
      aServlet.delete();
    }
    for(int i=votes.size(); i > 0; i--)
    {
      Vote aVote = votes.get(i - 1);
      aVote.delete();
    }
    for(int i=standInfos.size(); i > 0; i--)
    {
      StandInfo aStandInfo = standInfos.get(i - 1);
      aStandInfo.delete();
    }
    for(int i=standOverviews.size(); i > 0; i--)
    {
      StandOverview aStandOverview = standOverviews.get(i - 1);
      aStandOverview.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "url" + ":" + getUrl()+ "," +
            "user" + ":" + getUser()+ "," +
            "password" + ":" + getPassword()+ "]";
  }
}