<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class LoginQRCode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LoginQRCode State Machines
  private static $StateLogin = 1;
  private static $StateVoting = 2;
  private static $StateRegistered = 3;
  private static $StateEnteredPass = 4;
  private static $StateHasVoted = 5;
  private $state;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->setState(self::$StateLogin);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStateFullName()
  {
    $answer = $this->getState();
    return $answer;
  }

  public function getState()
  {
    if ($this->state == self::$StateLogin) { return "StateLogin"; }
    elseif ($this->state == self::$StateVoting) { return "StateVoting"; }
    elseif ($this->state == self::$StateRegistered) { return "StateRegistered"; }
    elseif ($this->state == self::$StateEnteredPass) { return "StateEnteredPass"; }
    elseif ($this->state == self::$StateHasVoted) { return "StateHasVoted"; }
    return null;
  }

  public function ifHasSession()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateLogin)
    {
      $this->setState(self::$StateVoting);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function register()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateLogin)
    {
      $this->setState(self::$StateRegistered);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function doVote()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateVoting)
    {
      $this->setState(self::$StateHasVoted);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function enterPass()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateRegistered)
    {
      $this->setState(self::$StateEnteredPass);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function correctPass()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateEnteredPass)
    {
      $this->setState(self::$StateVoting);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function wrongPass()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateEnteredPass)
    {
      $this->setState(self::$StateLogin);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function newStand()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateHasVoted)
    {
      $this->setState(self::$StateLogin);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  private function setState($aState)
  {
    $this->state = $aState;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}
?>