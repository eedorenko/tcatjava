package model;

import java.util.ArrayList;
import java.util.List;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 08 13:24:56 CDT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MedalsVOImpl
  extends ViewObjectImpl
{
  /**
   * This is the default constructor (do not remove).
   */
  public MedalsVOImpl()
  {
  }

  public List<Row> getMedals()
  {
    List<Row> list = new ArrayList();
    executeQuery();
    reset();
    while (hasNext())
    {
      list.add(next());
    }
    return list;
  }
}

