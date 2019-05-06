<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class Vote
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vote Attributes
  private $id;
  private $username;
  private $stand;
  private $score;

  //Vote Associations
  private $dBHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aId, $aUsername, $aStand, $aScore, $aDBHandler)
  {
    $this->id = $aId;
    $this->username = $aUsername;
    $this->stand = $aStand;
    $this->score = $aScore;
    $didAddDBHandler = $this->setDBHandler($aDBHandler);
    if (!$didAddDBHandler)
    {
      throw new Exception("Unable to create vote due to dBHandler");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setId($aId)
  {
    $wasSet = false;
    $this->id = $aId;
    $wasSet = true;
    return $wasSet;
  }

  public function setUsername($aUsername)
  {
    $wasSet = false;
    $this->username = $aUsername;
    $wasSet = true;
    return $wasSet;
  }

  public function setStand($aStand)
  {
    $wasSet = false;
    $this->stand = $aStand;
    $wasSet = true;
    return $wasSet;
  }

  public function setScore($aScore)
  {
    $wasSet = false;
    $this->score = $aScore;
    $wasSet = true;
    return $wasSet;
  }

  public function getId()
  {
    return $this->id;
  }

  public function getUsername()
  {
    return $this->username;
  }

  public function getStand()
  {
    return $this->stand;
  }

  public function getScore()
  {
    return $this->score;
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
      $existingDBHandler->removeVote($this);
    }
    $this->dBHandler->addVote($this);
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
    $placeholderDBHandler->removeVote($this);
  }

}
?>