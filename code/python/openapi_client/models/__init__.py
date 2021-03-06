# coding: utf-8

# flake8: noqa
"""
    Bevragen Ingeschreven Personen

    API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.1.0/features) voor nadere toelichting.   # noqa: E501

    The version of the OpenAPI document: 1.1.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

# import models into model package
from openapi_client.models.aanduiding_bij_huisnummer_enum import AanduidingBijHuisnummerEnum
from openapi_client.models.aanduiding_bijzonder_nederlanderschap_enum import AanduidingBijzonderNederlanderschapEnum
from openapi_client.models.aangaan_huwelijk_partnerschap import AangaanHuwelijkPartnerschap
from openapi_client.models.aangaan_huwelijk_partnerschap_in_onderzoek import AangaanHuwelijkPartnerschapInOnderzoek
from openapi_client.models.adres import Adres
from openapi_client.models.bad_request_foutbericht import BadRequestFoutbericht
from openapi_client.models.bad_request_foutbericht_all_of import BadRequestFoutberichtAllOf
from openapi_client.models.datum_onvolledig import DatumOnvolledig
from openapi_client.models.foutbericht import Foutbericht
from openapi_client.models.geboorte import Geboorte
from openapi_client.models.geboorte_all_of import GeboorteAllOf
from openapi_client.models.geboorte_in_onderzoek import GeboorteInOnderzoek
from openapi_client.models.geboortedatum import Geboortedatum
from openapi_client.models.geslacht_enum import GeslachtEnum
from openapi_client.models.gezagsverhouding import Gezagsverhouding
from openapi_client.models.gezagsverhouding_in_onderzoek import GezagsverhoudingInOnderzoek
from openapi_client.models.hal_collection_links import HalCollectionLinks
from openapi_client.models.hal_link import HalLink
from openapi_client.models.indicatie_gezag_minderjarige_enum import IndicatieGezagMinderjarigeEnum
from openapi_client.models.ingeschreven_persoon import IngeschrevenPersoon
from openapi_client.models.ingeschreven_persoon_embedded import IngeschrevenPersoonEmbedded
from openapi_client.models.ingeschreven_persoon_hal import IngeschrevenPersoonHal
from openapi_client.models.ingeschreven_persoon_hal_all_of import IngeschrevenPersoonHalAllOf
from openapi_client.models.ingeschreven_persoon_hal_basis import IngeschrevenPersoonHalBasis
from openapi_client.models.ingeschreven_persoon_hal_basis_all_of import IngeschrevenPersoonHalBasisAllOf
from openapi_client.models.ingeschreven_persoon_hal_collectie import IngeschrevenPersoonHalCollectie
from openapi_client.models.ingeschreven_persoon_hal_collectie_embedded import IngeschrevenPersoonHalCollectieEmbedded
from openapi_client.models.ingeschreven_persoon_links import IngeschrevenPersoonLinks
from openapi_client.models.invalid_params import InvalidParams
from openapi_client.models.kiesrecht import Kiesrecht
from openapi_client.models.kind import Kind
from openapi_client.models.kind_hal_basis import KindHalBasis
from openapi_client.models.kind_hal_basis_all_of import KindHalBasisAllOf
from openapi_client.models.kind_hal_collectie import KindHalCollectie
from openapi_client.models.kind_hal_collectie_embedded import KindHalCollectieEmbedded
from openapi_client.models.kind_in_onderzoek import KindInOnderzoek
from openapi_client.models.kind_links import KindLinks
from openapi_client.models.naam import Naam
from openapi_client.models.naam_in_onderzoek import NaamInOnderzoek
from openapi_client.models.naam_persoon import NaamPersoon
from openapi_client.models.naam_persoon_all_of import NaamPersoonAllOf
from openapi_client.models.naamgebruik_enum import NaamgebruikEnum
from openapi_client.models.nationaliteit import Nationaliteit
from openapi_client.models.nationaliteit_in_onderzoek import NationaliteitInOnderzoek
from openapi_client.models.opschorting_bijhouding import OpschortingBijhouding
from openapi_client.models.ouder import Ouder
from openapi_client.models.ouder_aanduiding_enum import OuderAanduidingEnum
from openapi_client.models.ouder_hal_basis import OuderHalBasis
from openapi_client.models.ouder_hal_basis_all_of import OuderHalBasisAllOf
from openapi_client.models.ouder_hal_collectie import OuderHalCollectie
from openapi_client.models.ouder_hal_collectie_embedded import OuderHalCollectieEmbedded
from openapi_client.models.ouder_in_onderzoek import OuderInOnderzoek
from openapi_client.models.ouder_links import OuderLinks
from openapi_client.models.overlijden import Overlijden
from openapi_client.models.overlijden_in_onderzoek import OverlijdenInOnderzoek
from openapi_client.models.partner import Partner
from openapi_client.models.partner_hal_basis import PartnerHalBasis
from openapi_client.models.partner_hal_basis_all_of import PartnerHalBasisAllOf
from openapi_client.models.partner_hal_collectie import PartnerHalCollectie
from openapi_client.models.partner_hal_collectie_embedded import PartnerHalCollectieEmbedded
from openapi_client.models.partner_in_onderzoek import PartnerInOnderzoek
from openapi_client.models.partner_links import PartnerLinks
from openapi_client.models.persoon_in_onderzoek import PersoonInOnderzoek
from openapi_client.models.reden_opschorting_bijhouding_enum import RedenOpschortingBijhoudingEnum
from openapi_client.models.soort_adres_enum import SoortAdresEnum
from openapi_client.models.soort_verbintenis_enum import SoortVerbintenisEnum
from openapi_client.models.verblijfplaats import Verblijfplaats
from openapi_client.models.verblijfplaats_all_of import VerblijfplaatsAllOf
from openapi_client.models.verblijfplaats_in_onderzoek import VerblijfplaatsInOnderzoek
from openapi_client.models.verblijfstitel import Verblijfstitel
from openapi_client.models.verblijfstitel_in_onderzoek import VerblijfstitelInOnderzoek
from openapi_client.models.waardetabel import Waardetabel
