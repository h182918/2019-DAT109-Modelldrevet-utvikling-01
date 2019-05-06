/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



/**
 * class Booking {
 * state {
 * newBooking { 
 * assignSeat -> seatAssigned;
 * cancel -> cancelled;
 * }
 * seatAssigned {
 * cancel -> cancelled;
 * checkIn -> checkedIn;
 * }
 * checkedIn {
 * cancel -> cancelled;
 * complete -> completed;
 * }
 * cancelled {}
 * completed {}
 * }
 * }
 */
// line 2 "model.ump"
// line 62 "model.ump"
// line 67 "model.ump"
// line 72 "model.ump"
// line 77 "model.ump"
// line 82 "model.ump"
// line 87 "model.ump"
// line 92 "model.ump"
// line 97 "model.ump"
// line 102 "model.ump"
// line 107 "model.ump"
// line 112 "model.ump"
// line 117 "model.ump"
// line 122 "model.ump"
// line 127 "model.ump"
// line 132 "model.ump"
// line 137 "model.ump"
// line 142 "model.ump"
// line 147 "model.ump"
// line 152 "model.ump"
public class Login
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Login State Machines
  public enum State { LoginPage, EnterCredentials, adminPage, EnterRegistrationData, ReceivePasswordEmail, RegisterLogin, standAdmin }
  private State state;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Login()
  {
    setState(State.LoginPage);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStateFullName()
  {
    String answer = state.toString();
    return answer;
  }

  public State getState()
  {
    return state;
  }

  public boolean Registered()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case LoginPage:
        setState(State.EnterCredentials);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean NotRegistered()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case LoginPage:
        setState(State.EnterRegistrationData);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean ifAdmin()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case EnterCredentials:
        setState(State.adminPage);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean ifStand()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case EnterCredentials:
        setState(State.standAdmin);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean wrongCredentials()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case EnterCredentials:
        setState(State.LoginPage);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean changeStands()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case adminPage:
        setState(State.adminPage);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean enteredRegistrationData()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case EnterRegistrationData:
        setState(State.ReceivePasswordEmail);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean receiveMail()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case ReceivePasswordEmail:
        setState(State.RegisterLogin);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean correctPass()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case RegisterLogin:
        setState(State.standAdmin);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean wrongPass()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case RegisterLogin:
        setState(State.LoginPage);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean enterInfo()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case standAdmin:
        setState(State.standAdmin);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void setState(State aState)
  {
    state = aState;
  }

  public void delete()
  {}

}