Feature: MegaMenu

  Scenario Outline: Validate MegaMenu functionality
    Given user is on home page to validate MegaMenu
     When User hovers on <MegaMenuCat> menu
     Then <MegaMenuSubCat> is displayed
    
    
  
    Examples: 
  
      | MegaMenuCat | MegaMenuSubCat  | 
      | DRESSES     | EVENING DRESSES | 
