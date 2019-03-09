package com.roacult.kero.oxxy.domain.exception


sealed class Failure {

    sealed class SignInFaillure : Failure(){
        class UserNotFoundFaillurre : SignInFaillure()
        class AutherFaillure(val e:Throwable?) : SignInFaillure()
        class UserAlreadyExist:SignInFaillure()
        class UserBanned:SignInFaillure()
        class CodeSendingError():SignInFaillure()
    }

    sealed class LoginFaillure : Failure(){
        class UserNotSubscribedYet : LoginFaillure()
        class UserBanned:LoginFaillure()
        class WrongPassword:LoginFaillure()
        class NotFromEsi():LoginFaillure()
        class AutherFaillure(val t:Throwable?) : LoginFaillure()
    }

    sealed class ConfirmEmailFaillure() : Failure(){
        class MaximumNumbreOfTry() : ConfirmEmailFaillure()
        class CadeNotCorrect() : ConfirmEmailFaillure()
        class AutherFaillur() : ConfirmEmailFaillure()
    }

    sealed class SaveInfoFaillure : Failure(){
        class OperationFailed:SaveInfoFaillure()
       class OtherFailure(val t:Throwable?) :SaveInfoFaillure()
    }

    sealed class ResendConfirmationFailure:Failure(){
        //TODO  what (CodeError) is??
        class CodeError():ResendConfirmationFailure()
        class OtherFailure(val t:Throwable?):ResendConfirmationFailure()
    }
    sealed class ResetPasswordFailure:Failure(){
        class OperationFailed :ResetPasswordFailure()
        class   OtherFailure(val t:Throwable?):ResetPasswordFailure()
    }
    sealed class SendCodeResetPassword:Failure(){
        class UserNotFound:SendCodeResetPassword()
        class UserNotLoggedIn:SendCodeResetPassword()
        class UserBanned:SendCodeResetPassword()
        class OperationFailed():SendCodeResetPassword()
        class OtherFailrue(val t:Throwable?):SendCodeResetPassword()
    }
    sealed class GetAllChalengesFailure:Failure(){
          object UserBannedForever:GetAllChalengesFailure()
        object  UserBannedTemp:GetAllChalengesFailure()
        object OperationFailed:GetAllChalengesFailure()
          class OtherFailrue(t:Throwable):GetAllChalengesFailure()
    }
}
