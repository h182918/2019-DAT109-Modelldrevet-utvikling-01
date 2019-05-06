<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class StandInfo
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //StandInfo Attributes
  private $id;
  private $name;
  private $imageUrl;
  private $epostsadmin;
  private $pin;

  //StandInfo Associations
  private $dBHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aId, $aName, $aImageUrl, $aEpostsadmin, $aPin, $aDBHandler)
  {
    $this->id = $aId;
    $this->name = $aName;
    $this->imageUrl = $aImageUrl;
    $this->epostsadmin = $aEpostsadmin;
    $this->pin = $aPin;
    $didAddDBHandler = $this->setDBHandler($aDBHandler);
    if (!$didAddDBHandler)
    {
      throw new Exception("Unable to create standInfo due to dBHandler");
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

  public function setName($aName)
  {
    $wasSet = false;
    $this->name = $aName;
    $wasSet = true;
    return $wasSet;
  }

  public function setImageUrl($aImageUrl)
  {
    $wasSet = false;
    $this->imageUrl = $aImageUrl;
    $wasSet = true;
    return $wasSet;
  }

  public function setEpostsadmin($aEpostsadmin)
  {
    $wasSet = false;
    $this->epostsadmin = $aEpostsadmin;
    $wasSet = true;
    return $wasSet;
  }

  public function setPin($aPin)
  {
    $wasSet = false;
    $this->pin = $aPin;
    $wasSet = true;
    return $wasSet;
  }

  public function getId()
  {
    return $this->id;
  }

  public function getName()
  {
    return $this->name;
  }

  public function getImageUrl()
  {
    return $this->imageUrl;
  }

  public function getEpostsadmin()
  {
    return $this->epostsadmin;
  }

  public function getPin()
  {
    return $this->pin;
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
      $existingDBHandler->removeStandInfo($this);
    }
    $this->dBHandler->addStandInfo($this);
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
    $placeholderDBHandler->removeStandInfo($this);
  }

}
?>