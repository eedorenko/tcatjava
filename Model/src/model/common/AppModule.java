package model.common;

import java.util.List;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 08 13:08:28 CDT 2018
// ---------------------------------------------------------------------
public interface AppModule
  extends ApplicationModule
{
  long getLong();

  List<Row> getMedals();
}

