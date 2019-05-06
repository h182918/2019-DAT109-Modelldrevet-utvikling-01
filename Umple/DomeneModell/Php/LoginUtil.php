<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class LoginUtil
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LoginUtil Associations
  private $login;
  private $javaEmail;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aLogin = null, $aJavaEmail = null)
  {
    if (func_num_args() == 0) { return; }

    if ($aLogin == null || $aLogin->getLoginUtil() != null)
    {
      throw new Exception("Unable to create LoginUtil due to aLogin");
    }
    $this->login = $aLogin;
    if ($aJavaEmail == null || $aJavaEmail->getLoginUtil() != null)
    {
      throw new Exception("Unable to create LoginUtil due to aJavaEmail");
    }
    $this->javaEmail = $aJavaEmail;
  }
  public static function newInstance($aDBHandlerForLogin, $aRegistrerStandForJavaEmail)
  {
    $thisInstance = new LoginUtil();
    $thisInstance->login = new Login($aDBHandlerForLogin, $thisInstance);
    $thisInstance->javaEmail = new JavaEmail($aRegistrerStandForJavaEmail, $thisInstance);
    return $thisInstance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getLogin()
  {
    return $this->login;
  }

  public function getJavaEmail()
  {
    return $this->javaEmail;
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {
    $existingLogin = $this->login;
    $this->login = null;
    if ($existingLogin != null)
    {
      $existingLogin->delete();
    }
    $existingJavaEmail = $this->javaEmail;
    $this->javaEmail = null;
    if ($existingJavaEmail != null)
    {
      $existingJavaEmail->delete();
    }
  }

}
?>