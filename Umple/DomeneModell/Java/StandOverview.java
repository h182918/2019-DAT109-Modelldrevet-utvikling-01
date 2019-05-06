/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 69 "model.ump"
// line 152 "model.ump"
public class StandOverview
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandOverview Attributes
  private StandInfo stand;
  private double average;
  private int totalscore;

  //StandOverview Associations
  private DBHandler dBHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public StandOverview(StandInfo aStand, double aAverage, int aTotalscore, DBHandler aDBHandler)
  {
    stand = aStand;
    average = aAverage;
    totalscore = aTotalscore;
    boolean didAddDBHandler = setDBHandler(aDBHandler);
    if (!didAddDBHandler)
    {
      throw new RuntimeException("Unable to create standOverview due to dBHandler");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStand(StandInfo aStand)
  {
    boolean wasSet = false;
    stand = aStand;
    wasSet = true;
    return wasSet;
  }

  public boolean setAverage(double aAverage)
  {
    boolean wasSet = false;
    average = aAverage;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotalscore(int aTotalscore)
  {
    boolean wasSet = false;
    totalscore = aTotalscore;
    wasSet = true;
    return wasSet;
  }

  public StandInfo getStand()
  {
    return stand;
  }

  public double getAverage()
  {
    return average;
  }

  public int getTotalscore()
  {
    return totalscore;
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
      existingDBHandler.removeStandOverview(this);
    }
    dBHandler.addStandOverview(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    DBHandler placeholderDBHandler = dBHandler;
    this.dBHandler = null;
    if(placeholderDBHandler != null)
    {
      placeholderDBHandler.removeStandOverview(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "average" + ":" + getAverage()+ "," +
            "totalscore" + ":" + getTotalscore()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "stand" + "=" + (getStand() != null ? !getStand().equals(this)  ? getStand().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "dBHandler = "+(getDBHandler()!=null?Integer.toHexString(System.identityHashCode(getDBHandler())):"null");
  }
}