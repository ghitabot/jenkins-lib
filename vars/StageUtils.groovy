import org.jenkinsci.plugins.pipeline.modeldefinition.Utils as JenkinsUtils

static void markStageSkipped(String stageName, Boolean conditionalSkip = true){
    if(conditionalSkip){
        JenkinsUtils.markStageSkippedForConditional(stageName)
    } else{
        JenkinsUtils.markStageSkippedForFailure(stageName)
    }
}
