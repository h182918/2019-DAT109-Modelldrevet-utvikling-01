<?php
/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/

class RegistrerStand extends Servlet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //RegistrerStand Associations
  private $javaEmail;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct($aDBHandler = null, $aJavaEmail = null)
  {
    if (func_num_args() == 0) { return; }

    parent::__construct($aDBHandler);
    if ($aJavaEmail == null || $aJavaEmail->getRegistrerStand() != null)
    {
      throw new Exception("Unable to create RegistrerStand due to aJavaEmail");
    }
    $this->javaEmail = $aJavaEmail;
  }
  public static function newInstance($aDBHandler, $aLoginUtilForJavaEmail)
  {
    $thisInstance = new RegistrerStand();
    $thisInstance->__construct($aDBHandler);
    $thisInstance->javaEmail = new JavaEmail($thisInstance, $aLoginUtilForJavaEmail);
    return $thisInstance;
  }
  private function callParentConstructor($aDBHandler)
  {
    parent::__construct($aDBHandler);
  }


  //------------------------
  // INTERFACE
  //------------------------

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
    $existingJavaEmail = $this->javaEmail;
    $this->javaEmail = null;
    if ($existingJavaEmail != null)
    {
      $existingJavaEmail->delete();
    }
    parent::delete();
  }

}
?>