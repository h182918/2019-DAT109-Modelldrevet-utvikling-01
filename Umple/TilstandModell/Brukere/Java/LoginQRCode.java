/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 2 "model.ump"
// line 44 "model.ump"
public class LoginQRCode
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //LoginQRCode State Machines
  public enum State { login, Voting, registered, enteredPass, hasVoted }
  private State state;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public LoginQRCode()
  {
    setState(State.login);
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

  public boolean ifHasSession()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case login:
        setState(State.Voting);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean register()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case login:
        setState(State.registered);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean doVote()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case Voting:
        setState(State.hasVoted);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean enterPass()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case registered:
        setState(State.enteredPass);
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
      case enteredPass:
        setState(State.Voting);
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
      case enteredPass:
        setState(State.login);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  public boolean newStand()
  {
    boolean wasEventProcessed = false;
    
    State aState = state;
    switch (aState)
    {
      case hasVoted:
        setState(State.login);
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