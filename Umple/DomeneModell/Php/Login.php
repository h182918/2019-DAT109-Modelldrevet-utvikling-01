<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class Login extends Servlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Login Associations
  private $loginUtil;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aDBHandler = null, $aLoginUtil = null)
  {
    if (func_num_args() == 0) { return; }

    parent::__construct($aDBHandler);
    if ($aLoginUtil == null || $aLoginUtil->getLogin() != null)
    {
      throw new Exception("Unable to create Login due to aLoginUtil");
    }
    $this->loginUtil = $aLoginUtil;
  }
  public static function newInstance($aDBHandler, $aJavaEmailForLoginUtil)
  {
    $thisInstance = new Login();
    $thisInstance->__construct($aDBHandler);
    $thisInstance->loginUtil = new LoginUtil($thisInstance, $aJavaEmailForLoginUtil);
    return $thisInstance;
  }
  private function callParentConstructor($aDBHandler)
  {
    parent::__construct($aDBHandler);
  }


  //------------------------
  // INTERFACE
  //------------------------

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
    $existingLoginUtil = $this->loginUtil;
    $this->loginUtil = null;
    if ($existingLoginUtil != null)
    {
      $existingLoginUtil->delete();
    }
    parent::delete();
  }

}
?>