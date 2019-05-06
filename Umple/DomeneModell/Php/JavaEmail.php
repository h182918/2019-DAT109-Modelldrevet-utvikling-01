<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class JavaEmail
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //JavaEmail Associations
  private $registrerStand;
  private $loginUtil;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aRegistrerStand = null, $aLoginUtil = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aRegistrerStand == null || $aRegistrerStand->getJavaEmail() != null)
    {
      throw new Exception("Unable to create JavaEmail due to aRegistrerStand");
    }
    $this->registrerStand = $aRegistrerStand;
    if ($aLoginUtil == null || $aLoginUtil->getJavaEmail() != null)
    {
      throw new Exception("Unable to create JavaEmail due to aLoginUtil");
    }
    $this->loginUtil = $aLoginUtil;
  }
  public static function newInstance($aDBHandlerForRegistrerStand, $aLoginForLoginUtil)
  {
    $thisInstance = new JavaEmail();
    $thisInstance->registrerStand = new RegistrerStand($aDBHandlerForRegistrerStand, $thisInstance);
    $thisInstance->loginUtil = new LoginUtil($aLoginForLoginUtil, $thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getRegistrerStand()
  {
    return $this->registrerStand;
  }

  public function getLoginUtil()
  {
    return $this->loginUtil;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingRegistrerStand = $this->registrerStand;
    $this->registrerStand = null;
    if ($existingRegistrerStand != null)
    {
      $existingRegistrerStand->delete();
    }
    $existingLoginUtil = $this->loginUtil;
    $this->loginUtil = null;
    if ($existingLoginUtil != null)
    {
      $existingLoginUtil->delete();
    }
  }

}
?>