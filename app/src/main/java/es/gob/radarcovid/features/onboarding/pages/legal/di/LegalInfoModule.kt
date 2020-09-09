/*
 * Copyright (c) 2020 Gobierno de España
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * SPDX-License-Identifier: MPL-2.0
 */

package es.gob.radarcovid.features.onboarding.pages.legal.di

import androidx.fragment.app.Fragment
import es.gob.radarcovid.features.onboarding.pages.legal.presenter.LegalInfoPresenterImpl
import es.gob.radarcovid.features.onboarding.pages.legal.protocols.LegalInfoPresenter
import es.gob.radarcovid.features.onboarding.pages.legal.protocols.LegalInfoRouter
import es.gob.radarcovid.features.onboarding.pages.legal.protocols.LegalInfoView
import es.gob.radarcovid.features.onboarding.pages.legal.router.LegalInfoRouterImpl
import es.gob.radarcovid.features.onboarding.pages.legal.view.LegalInfoFragment
import dagger.Module
import dagger.Provides

@Module
class LegalInfoModule {

    @Provides
    fun providesFragment(fragment: LegalInfoFragment): Fragment = fragment

    @Provides
    fun providesView(fragment: LegalInfoFragment): LegalInfoView = fragment

    @Provides
    fun providesPresenter(presenter: LegalInfoPresenterImpl): LegalInfoPresenter = presenter

    @Provides
    fun providesRouter(router: LegalInfoRouterImpl): LegalInfoRouter = router

}