<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class DBHandler
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DBHandler Attributes
  private $url;
  private $user;
  private $password;

  //DBHandler Associations
  private $servlets;
  private $votes;
  private $standInfos;
  private $standOverviews;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aUrl, $aUser, $aPassword)
  {
    $this->url = $aUrl;
    $this->user = $aUser;
    $this->password = $aPassword;
    $this->servlets = array();
    $this->votes = array();
    $this->standInfos = array();
    $this->standOverviews = array();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function setUrl($aUrl)
  {
    $wasSet = false;
    $this->url = $aUrl;
    $wasSet = true;
    return $wasSet;
  }

  public function setUser($aUser)
  {
    $wasSet = false;
    $this->user = $aUser;
    $wasSet = true;
    return $wasSet;
  }

  public function setPassword($aPassword)
  {
    $wasSet = false;
    $this->password = $aPassword;
    $wasSet = true;
    return $wasSet;
  }

  public function getUrl()
  {
    return $this->url;
  }

  public function getUser()
  {
    return $this->user;
  }

  public function getPassword()
  {
    return $this->password;
  }

  public function getServlet_index($index)
  {
    $aServlet = $this->servlets[$index];
    return $aServlet;
  }

  public function getServlets()
  {
    $newServlets = $this->servlets;
    return $newServlets;
  }

  public function numberOfServlets()
  {
    $number = count($this->servlets);
    return $number;
  }

  public function hasServlets()
  {
    $has = $this->numberOfServlets() > 0;
    return $has;
  }

  public function indexOfServlet($aServlet)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->servlets as $servlet)
    {
      if ($servlet->equals($aServlet))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getVote_index($index)
  {
    $aVote = $this->votes[$index];
    return $aVote;
  }

  public function getVotes()
  {
    $newVotes = $this->votes;
    return $newVotes;
  }

  public function numberOfVotes()
  {
    $number = count($this->votes);
    return $number;
  }

  public function hasVotes()
  {
    $has = $this->numberOfVotes() > 0;
    return $has;
  }

  public function indexOfVote($aVote)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->votes as $vote)
    {
      if ($vote->equals($aVote))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getStandInfo_index($index)
  {
    $aStandInfo = $this->standInfos[$index];
    return $aStandInfo;
  }

  public function getStandInfos()
  {
    $newStandInfos = $this->standInfos;
    return $newStandInfos;
  }

  public function numberOfStandInfos()
  {
    $number = count($this->standInfos);
    return $number;
  }

  public function hasStandInfos()
  {
    $has = $this->numberOfStandInfos() > 0;
    return $has;
  }

  public function indexOfStandInfo($aStandInfo)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->standInfos as $standInfo)
    {
      if ($standInfo->equals($aStandInfo))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public function getStandOverview_index($index)
  {
    $aStandOverview = $this->standOverviews[$index];
    return $aStandOverview;
  }

  public function getStandOverviews()
  {
    $newStandOverviews = $this->standOverviews;
    return $newStandOverviews;
  }

  public function numberOfStandOverviews()
  {
    $number = count($this->standOverviews);
    return $number;
  }

  public function hasStandOverviews()
  {
    $has = $this->numberOfStandOverviews() > 0;
    return $has;
  }

  public function indexOfStandOverview($aStandOverview)
  {
    $wasFound = false;
    $index = 0;
    foreach($this->standOverviews as $standOverview)
    {
      if ($standOverview->equals($aStandOverview))
      {
        $wasFound = true;
        break;
      }
      $index += 1;
    }
    $index = $wasFound ? $index : -1;
    return $index;
  }

  public static function minimumNumberOfServlets()
  {
    return 0;
  }

  public function addServletVia()
  {
    return new Servlet($this);
  }

  public function addServlet($aServlet)
  {
    $wasAdded = false;
    if ($this->indexOfServlet($aServlet) !== -1) { return false; }
    $existingDBHandler = $aServlet->getDBHandler();
    $isNewDBHandler = $existingDBHandler != null && $this !== $existingDBHandler;
    if ($isNewDBHandler)
    {
      $aServlet->setDBHandler($this);
    }
    else
    {
      $this->servlets[] = $aServlet;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeServlet($aServlet)
  {
    $wasRemoved = false;
    //Unable to remove aServlet, as it must always have a dBHandler
    if ($this !== $aServlet->getDBHandler())
    {
      unset($this->servlets[$this->indexOfServlet($aServlet)]);
      $this->servlets = array_values($this->servlets);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addServletAt($aServlet, $index)
  {  
    $wasAdded = false;
    if($this->addServlet($aServlet))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfServlets()) { $index = $this->numberOfServlets() - 1; }
      array_splice($this->servlets, $this->indexOfServlet($aServlet), 1);
      array_splice($this->servlets, $index, 0, array($aServlet));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveServletAt($aServlet, $index)
  {
    $wasAdded = false;
    if($this->indexOfServlet($aServlet) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfServlets()) { $index = $this->numberOfServlets() - 1; }
      array_splice($this->servlets, $this->indexOfServlet($aServlet), 1);
      array_splice($this->servlets, $index, 0, array($aServlet));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addServletAt($aServlet, $index);
    }
    return $wasAdded;
  }

  public static function minimumNumberOfVotes()
  {
    return 0;
  }

  public function addVoteVia($aId, $aUsername, $aStand, $aScore)
  {
    return new Vote($aId, $aUsername, $aStand, $aScore, $this);
  }

  public function addVote($aVote)
  {
    $wasAdded = false;
    if ($this->indexOfVote($aVote) !== -1) { return false; }
    $existingDBHandler = $aVote->getDBHandler();
    $isNewDBHandler = $existingDBHandler != null && $this !== $existingDBHandler;
    if ($isNewDBHandler)
    {
      $aVote->setDBHandler($this);
    }
    else
    {
      $this->votes[] = $aVote;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeVote($aVote)
  {
    $wasRemoved = false;
    //Unable to remove aVote, as it must always have a dBHandler
    if ($this !== $aVote->getDBHandler())
    {
      unset($this->votes[$this->indexOfVote($aVote)]);
      $this->votes = array_values($this->votes);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addVoteAt($aVote, $index)
  {  
    $wasAdded = false;
    if($this->addVote($aVote))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfVotes()) { $index = $this->numberOfVotes() - 1; }
      array_splice($this->votes, $this->indexOfVote($aVote), 1);
      array_splice($this->votes, $index, 0, array($aVote));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveVoteAt($aVote, $index)
  {
    $wasAdded = false;
    if($this->indexOfVote($aVote) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfVotes()) { $index = $this->numberOfVotes() - 1; }
      array_splice($this->votes, $this->indexOfVote($aVote), 1);
      array_splice($this->votes, $index, 0, array($aVote));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addVoteAt($aVote, $index);
    }
    return $wasAdded;
  }

  public static function minimumNumberOfStandInfos()
  {
    return 0;
  }

  public function addStandInfoVia($aId, $aName, $aImageUrl, $aEpostsadmin, $aPin)
  {
    return new StandInfo($aId, $aName, $aImageUrl, $aEpostsadmin, $aPin, $this);
  }

  public function addStandInfo($aStandInfo)
  {
    $wasAdded = false;
    if ($this->indexOfStandInfo($aStandInfo) !== -1) { return false; }
    $existingDBHandler = $aStandInfo->getDBHandler();
    $isNewDBHandler = $existingDBHandler != null && $this !== $existingDBHandler;
    if ($isNewDBHandler)
    {
      $aStandInfo->setDBHandler($this);
    }
    else
    {
      $this->standInfos[] = $aStandInfo;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeStandInfo($aStandInfo)
  {
    $wasRemoved = false;
    //Unable to remove aStandInfo, as it must always have a dBHandler
    if ($this !== $aStandInfo->getDBHandler())
    {
      unset($this->standInfos[$this->indexOfStandInfo($aStandInfo)]);
      $this->standInfos = array_values($this->standInfos);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addStandInfoAt($aStandInfo, $index)
  {  
    $wasAdded = false;
    if($this->addStandInfo($aStandInfo))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStandInfos()) { $index = $this->numberOfStandInfos() - 1; }
      array_splice($this->standInfos, $this->indexOfStandInfo($aStandInfo), 1);
      array_splice($this->standInfos, $index, 0, array($aStandInfo));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveStandInfoAt($aStandInfo, $index)
  {
    $wasAdded = false;
    if($this->indexOfStandInfo($aStandInfo) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStandInfos()) { $index = $this->numberOfStandInfos() - 1; }
      array_splice($this->standInfos, $this->indexOfStandInfo($aStandInfo), 1);
      array_splice($this->standInfos, $index, 0, array($aStandInfo));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addStandInfoAt($aStandInfo, $index);
    }
    return $wasAdded;
  }

  public static function minimumNumberOfStandOverviews()
  {
    return 0;
  }

  public function addStandOverviewVia($aStand, $aAverage, $aTotalscore)
  {
    return new StandOverview($aStand, $aAverage, $aTotalscore, $this);
  }

  public function addStandOverview($aStandOverview)
  {
    $wasAdded = false;
    if ($this->indexOfStandOverview($aStandOverview) !== -1) { return false; }
    $existingDBHandler = $aStandOverview->getDBHandler();
    $isNewDBHandler = $existingDBHandler != null && $this !== $existingDBHandler;
    if ($isNewDBHandler)
    {
      $aStandOverview->setDBHandler($this);
    }
    else
    {
      $this->standOverviews[] = $aStandOverview;
    }
    $wasAdded = true;
    return $wasAdded;
  }

  public function removeStandOverview($aStandOverview)
  {
    $wasRemoved = false;
    //Unable to remove aStandOverview, as it must always have a dBHandler
    if ($this !== $aStandOverview->getDBHandler())
    {
      unset($this->standOverviews[$this->indexOfStandOverview($aStandOverview)]);
      $this->standOverviews = array_values($this->standOverviews);
      $wasRemoved = true;
    }
    return $wasRemoved;
  }

  public function addStandOverviewAt($aStandOverview, $index)
  {  
    $wasAdded = false;
    if($this->addStandOverview($aStandOverview))
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStandOverviews()) { $index = $this->numberOfStandOverviews() - 1; }
      array_splice($this->standOverviews, $this->indexOfStandOverview($aStandOverview), 1);
      array_splice($this->standOverviews, $index, 0, array($aStandOverview));
      $wasAdded = true;
    }
    return $wasAdded;
  }

  public function addOrMoveStandOverviewAt($aStandOverview, $index)
  {
    $wasAdded = false;
    if($this->indexOfStandOverview($aStandOverview) !== -1)
    {
      if($index < 0 ) { $index = 0; }
      if($index > $this->numberOfStandOverviews()) { $index = $this->numberOfStandOverviews() - 1; }
      array_splice($this->standOverviews, $this->indexOfStandOverview($aStandOverview), 1);
      array_splice($this->standOverviews, $index, 0, array($aStandOverview));
      $wasAdded = true;
    } 
    else 
    {
      $wasAdded = $this->addStandOverviewAt($aStandOverview, $index);
    }
    return $wasAdded;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    foreach ($this->servlets as $aServlet)
    {
      $aServlet->delete();
    }
    foreach ($this->votes as $aVote)
    {
      $aVote->delete();
    }
    foreach ($this->standInfos as $aStandInfo)
    {
      $aStandInfo->delete();
    }
    foreach ($this->standOverviews as $aStandOverview)
    {
      $aStandOverview->delete();
    }
  }

}
?>