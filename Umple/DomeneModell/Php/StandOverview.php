<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class StandOverview
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandOverview Attributes
  private $stand;
  private $average;
  private $totalscore;

  //StandOverview Associations
  private $dBHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aStand, $aAverage, $aTotalscore, $aDBHandler)
  {
    $this->stand = $aStand;
    $this->average = $aAverage;
    $this->totalscore = $aTotalscore;
    $didAddDBHandler = $this->setDBHandler($aDBHandler);
    if (!$didAddDBHandler)
    {
      throw new Exception("Unable to create standOverview due to dBHandler");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setStand($aStand)
  {
    $wasSet = false;
    $this->stand = $aStand;
    $wasSet = true;
    return $wasSet;
  }

  public function setAverage($aAverage)
  {
    $wasSet = false;
    $this->average = $aAverage;
    $wasSet = true;
    return $wasSet;
  }

  public function setTotalscore($aTotalscore)
  {
    $wasSet = false;
    $this->totalscore = $aTotalscore;
    $wasSet = true;
    return $wasSet;
  }

  public function getStand()
  {
    return $this->stand;
  }

  public function getAverage()
  {
    return $this->average;
  }

  public function getTotalscore()
  {
    return $this->totalscore;
  }

  public function getDBHandler()
  {
    return $this->dBHandler;
  }

  public function setDBHandler($aDBHandler)
  {
    $wasSet = false;
    if ($aDBHandler == null)
    {
      return $wasSet;
    }
    
    $existingDBHandler = $this->dBHandler;
    $this->dBHandler = $aDBHandler;
    if ($existingDBHandler != null && $existingDBHandler != $aDBHandler)
    {
      $existingDBHandler->removeStandOverview($this);
    }
    $this->dBHandler->addStandOverview($this);
    $wasSet = true;
    return $wasSet;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $placeholderDBHandler = $this->dBHandler;
    $this->dBHandler = null;
    $placeholderDBHandler->removeStandOverview($this);
  }

}
?>