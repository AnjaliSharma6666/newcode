import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import groovy.xml.MarkupBuilder

//Specify startConfig here or pass as properties when launching the script
//ext.sc_executionNodeIds = '22431,22432,22433'
//ext.sc_host = 'http://localhost:19120'
//ext.sc_token = '80827e02-cfda-4d2d-b0aa-2d5205eb6ea9'
//ext.sc_sourceControlBranch
//ext.sc_buildName
//ext.sc_sinceBuild
//ext.sc_StartOption
//ext.sc_collectResults
//ext.sc_collectResultFiles
//ext.sc_startDelay

task silkCentralLaunch {
  def sc_propertyNames = ['sc_executionNodeIds', 'sc_host', 'sc_token', 'sc_sourceControlBranch', 'sc_buildName', 'sc_sinceBuild', 'sc_StartOption', 'sc_collectResults', 'sc_startDelay']
  
  requiredProperties.each {
  println it
    }
  }
}
