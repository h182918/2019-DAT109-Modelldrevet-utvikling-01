<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class Servlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Servlet Associations
  private $dBHandler;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aDBHandler)
  {
    $didAddDBHandler = $this->setDBHandler($aDBHandler);
    if (!$didAddDBHandler)
    {
      throw new Exception("Unable to create servlet due to dBHandler");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

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
      $existingDBHandler->removeServlet($this);
    }
    $this->dBHandler->addServlet($this);
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
    $placeholderDBHandler->removeServlet($this);
  }

}
?>