package com.mozilla.fennec.search.models;

public interface HasTitle extends CardModel {
  public String getTitle();
  public void setTitle(String title);

  public int getIcon();
  public void setIcon(int icon);
}
