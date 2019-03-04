package com.roacult.kero.oxxy.domain.interactors

import com.roacult.kero.oxxy.domain.exception.Failure
import com.roacult.kero.oxxy.domain.functional.CouroutineDispatchers
import com.roacult.kero.oxxy.domain.functional.Either
import kotlinx.coroutines.delay
import javax.inject.Inject

class Login @Inject constructor(dispatchers: CouroutineDispatchers) : EitherInteractor<LoginParam,None,Failure.LoginFaillure>{

    override val dispatcher =dispatchers.computaion
    override val ResultDispatcher= dispatchers.main

    override suspend fun invoke(executeParams: LoginParam): Either<Failure.LoginFaillure, None> {
        delay(3000)
        return Either.Right(None())
    }
}

data class LoginParam(val email : String ,val password : String)