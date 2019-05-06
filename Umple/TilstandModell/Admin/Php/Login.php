<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

/*
class Booking {
  state {
    newBooking { 
      assignSeat -> seatAssigned;
      cancel -> cancelled;
    }
    seatAssigned {
      cancel -> cancelled;
      checkIn -> checkedIn;
    }
    checkedIn {
      cancel -> cancelled;
      complete -> completed;
    }
    cancelled {}
    completed {}
  }
}
*/
class Login
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Login State Machines
  private static $StateLoginPage = 1;
  private static $StateEnterCredentials = 2;
  private static $StateAdminPage = 3;
  private static $StateEnterRegistrationData = 4;
  private static $StateReceivePasswordEmail = 5;
  private static $StateRegisterLogin = 6;
  private static $StateStandAdmin = 7;
  private $state;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->setState(self::$StateLoginPage);
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
    if ($this->state == self::$StateLoginPage) { return "StateLoginPage"; }
    elseif ($this->state == self::$StateEnterCredentials) { return "StateEnterCredentials"; }
    elseif ($this->state == self::$StateAdminPage) { return "StateAdminPage"; }
    elseif ($this->state == self::$StateEnterRegistrationData) { return "StateEnterRegistrationData"; }
    elseif ($this->state == self::$StateReceivePasswordEmail) { return "StateReceivePasswordEmail"; }
    elseif ($this->state == self::$StateRegisterLogin) { return "StateRegisterLogin"; }
    elseif ($this->state == self::$StateStandAdmin) { return "StateStandAdmin"; }
    return null;
  }

  public function Registered()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateLoginPage)
    {
      $this->setState(self::$StateEnterCredentials);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function NotRegistered()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateLoginPage)
    {
      $this->setState(self::$StateEnterRegistrationData);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function ifAdmin()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateEnterCredentials)
    {
      $this->setState(self::$StateAdminPage);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function ifStand()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateEnterCredentials)
    {
      $this->setState(self::$StateStandAdmin);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function wrongCredentials()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateEnterCredentials)
    {
      $this->setState(self::$StateLoginPage);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function changeStands()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateAdminPage)
    {
      $this->setState(self::$StateAdminPage);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function enteredRegistrationData()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateEnterRegistrationData)
    {
      $this->setState(self::$StateReceivePasswordEmail);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function receiveMail()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateReceivePasswordEmail)
    {
      $this->setState(self::$StateRegisterLogin);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function correctPass()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateRegisterLogin)
    {
      $this->setState(self::$StateStandAdmin);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function wrongPass()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateRegisterLogin)
    {
      $this->setState(self::$StateLoginPage);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  public function enterInfo()
  {
    $wasEventProcessed = false;
    
    $aState = $this->state;
    if ($aState == self::$StateStandAdmin)
    {
      $this->setState(self::$StateStandAdmin);
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