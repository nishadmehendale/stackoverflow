#https://stackoverflow.com/questions/71404080/jenkins-separator-parameter-with-declarative-syntax-pipeline-multibranch-pipel
String sectionHeaderStyleCss = ' color: white; background: green; font-family: Roboto, sans-serif !important; padding: 5px; text-align: center; '
String separatorStyleCss = ' border: 0; border-bottom: 1px dashed #ccc; background: #999; '

pipeline {
    agent any
     parameters
  {
    separator(
      name: "Group_1",
      sectionHeader: "Foo Params",
      separatorStyle: separatorStyleCss,
      sectionHeaderStyle: sectionHeaderStyleCss
    )
    string(
      name: 'FooStuff',
      defaultValue: 'Foo',
      description: 'Foo Stuff',
    )
    separator(
      name: "Group_2",
      sectionHeader: "Bar Params",
      separatorStyle: separatorStyleCss,
      sectionHeaderStyle: sectionHeaderStyleCss
    )
    string(
      name: 'BarStuff',
      defaultValue: 'Bar',
      description: 'Bar Stuff'
    )
  }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
