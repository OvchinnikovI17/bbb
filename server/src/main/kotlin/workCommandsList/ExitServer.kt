package workCommandsList

//import commandsHelpers.ResultModule
import moduleWithResults.ResultModule
import kotlin.system.exitProcess

/**
 * Class Exit. Stop the program.
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class ExitServer: Command(){

    /**
     * execute method. Stops server
     *
     * @param getArgs arguments
     */
    override fun execute(getArgs: MutableList<Any>, login:String, uniqueToken:String){
        //workWithResultModule.setMessages("end")
        dbModule.loadAllLogins(serverModule.availableTokens.keys)
        workWithResultModule.setUniqueKey(uniqueToken)
        serverModule.queueExeSen.put(workWithResultModule.getResultModule())
        exitProcess(0)


        //serverModule.serverSender(workWithResultModule.getResultModule())

    }
}