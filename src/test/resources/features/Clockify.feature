Feature: clockify

@prueba
Scenario Outline: Get all my workspaces
  Given tengo una apiKey correcta <apiKey>
  When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
  Then valido que el status code sea 200
  And valido que el campo id no sea nulo

  Examples:
    | operation | entity    | jsonName           | apiKey                                           |
    | GET       | WORKSPACE | getAllMyWorkspaces | Mzk1ODkyMmEtYmM2Yi00N2EyLTk5YzMtZTE3Y2RiZjZhZTQ0 |

@prueba
Scenario Outline: Add new workspace
  Given tengo una apiKey correcta <apiKey>
  When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
  Then valido que el status code sea 201
  And valido que el campo id no sea nulo

  Examples:
  | operation | entity    | jsonName      | apiKey                              |
  | POST      | WORKSPACE | addWorkspace  | Mzk1ODkyMmEtYmM2Yi00N2EyLTk5YzMtZTE3Y2RiZjZhZTQ0 |


@prueba
Scenario Outline: Get all projects on workspace
  Given tengo una apiKey correcta <apiKey>
  And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getAllMyWorkspaces' and ''
  And obtengo un id de workspace correcto
  When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
  Then valido que el status code sea 200
  Examples:
    | operation | entity  | jsonName         | apiKey                              |
    | GET       | PROJECT | getAllProjects   | Mzk1ODkyMmEtYmM2Yi00N2EyLTk5YzMtZTE3Y2RiZjZhZTQ0 |

@prueba
Scenario Outline: Add new project on workspace
  Given tengo una apiKey correcta <apiKey>
  And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getAllMyWorkspaces' and ''
  And obtengo un id de workspace correcto
  When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
  Then valido que el status code sea 201
  Examples:
    | operation | entity  | jsonName      | apiKey                                           |
    | POST      | PROJECT | addNewProject | Mzk1ODkyMmEtYmM2Yi00N2EyLTk5YzMtZTE3Y2RiZjZhZTQ0 |

@prueba
Scenario Outline: Delete project from workspace
  Given tengo una apiKey correcta <apiKey>
  And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getAllMyWorkspaces' and ''
  And obtengo un id de workspace correcto
  And I perform a 'GET' to 'PROJECT' endpoint with the 'getAllProjects' and ''
  And obtengo un id de proyecto
  When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<projectId>'
  Then valido que el status code sea 200
  Examples:
    | operation | entity  | jsonName    | apiKey                              |
    | DELETE    | PROJECT | deleteProject | Mzk1ODkyMmEtYmM2Yi00N2EyLTk5YzMtZTE3Y2RiZjZhZTQ0 |

@prueba
Scenario Outline: FindProjectByID
  Given tengo una apiKey correcta <apiKey>
  And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getAllMyWorkspaces' and ''
  And obtengo un id de workspace correcto
  And I perform a 'GET' to 'PROJECT' endpoint with the 'getAllProjects' and ''
  And obtengo un id de proyecto
  When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
  Then valido que el status code sea 200
  Examples:
    | operation | entity  | jsonName       | apiKey                                           |
    | GETBYID   | PROJECT | getProjectById | Mzk1ODkyMmEtYmM2Yi00N2EyLTk5YzMtZTE3Y2RiZjZhZTQ0 |

@prueba
Scenario Outline: Add new client
  Given tengo una apiKey correcta <apiKey>
  And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getAllMyWorkspaces' and ''
  And obtengo un id de workspace correcto
  When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
  Then valido que el status code sea 201
  And valido que el campo id no sea nulo
  Examples:
    | operation | entity  | jsonName    | apiKey                              |
    | POST      | CLIENT  | addClient   | Mzk1ODkyMmEtYmM2Yi00N2EyLTk5YzMtZTE3Y2RiZjZhZTQ0 |

@prueba
Scenario Outline: Get all clients on workspace
  Given tengo una apiKey correcta <apiKey>
  And I perform a 'GET' to 'WORKSPACE' endpoint with the 'getAllMyWorkspaces' and ''
  And obtengo un id de workspace correcto
  When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
  Then valido que el status code sea 200
  Examples:
    | operation | entity  | jsonName       | apiKey                              |
    | GET       | CLIENT  | getAllClients  | Mzk1ODkyMmEtYmM2Yi00N2EyLTk5YzMtZTE3Y2RiZjZhZTQ0 |

