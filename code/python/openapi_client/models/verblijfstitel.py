# coding: utf-8

"""
    Bevragen Ingeschreven Personen

    API voor het bevragen van ingeschreven personen uit de basisregistratie personen (BRP), inclusief de registratie niet-ingezeten (RNI). Met deze API kun je personen zoeken en actuele gegevens over personen, kinderen, partners en ouders raadplegen.  Gegevens die er niet zijn of niet actueel zijn krijg je niet terug. Heeft een persoon bijvoorbeeld geen geldige nationaliteit, en alleen een beëindigd partnerschap, dan krijg je geen gegevens over nationaliteit en partner.  Zie de [Functionele documentatie](https://github.com/VNG-Realisatie/Haal-Centraal-BRP-bevragen/tree/v1.1.0/features) voor nadere toelichting.   # noqa: E501

    The version of the OpenAPI document: 1.1.0
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class Verblijfstitel(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'aanduiding': 'Waardetabel',
        'datum_einde': 'DatumOnvolledig',
        'datum_ingang': 'DatumOnvolledig',
        'in_onderzoek': 'VerblijfstitelInOnderzoek'
    }

    attribute_map = {
        'aanduiding': 'aanduiding',
        'datum_einde': 'datumEinde',
        'datum_ingang': 'datumIngang',
        'in_onderzoek': 'inOnderzoek'
    }

    def __init__(self, aanduiding=None, datum_einde=None, datum_ingang=None, in_onderzoek=None, local_vars_configuration=None):  # noqa: E501
        """Verblijfstitel - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._aanduiding = None
        self._datum_einde = None
        self._datum_ingang = None
        self._in_onderzoek = None
        self.discriminator = None

        if aanduiding is not None:
            self.aanduiding = aanduiding
        if datum_einde is not None:
            self.datum_einde = datum_einde
        if datum_ingang is not None:
            self.datum_ingang = datum_ingang
        if in_onderzoek is not None:
            self.in_onderzoek = in_onderzoek

    @property
    def aanduiding(self):
        """Gets the aanduiding of this Verblijfstitel.  # noqa: E501


        :return: The aanduiding of this Verblijfstitel.  # noqa: E501
        :rtype: Waardetabel
        """
        return self._aanduiding

    @aanduiding.setter
    def aanduiding(self, aanduiding):
        """Sets the aanduiding of this Verblijfstitel.


        :param aanduiding: The aanduiding of this Verblijfstitel.  # noqa: E501
        :type: Waardetabel
        """

        self._aanduiding = aanduiding

    @property
    def datum_einde(self):
        """Gets the datum_einde of this Verblijfstitel.  # noqa: E501


        :return: The datum_einde of this Verblijfstitel.  # noqa: E501
        :rtype: DatumOnvolledig
        """
        return self._datum_einde

    @datum_einde.setter
    def datum_einde(self, datum_einde):
        """Sets the datum_einde of this Verblijfstitel.


        :param datum_einde: The datum_einde of this Verblijfstitel.  # noqa: E501
        :type: DatumOnvolledig
        """

        self._datum_einde = datum_einde

    @property
    def datum_ingang(self):
        """Gets the datum_ingang of this Verblijfstitel.  # noqa: E501


        :return: The datum_ingang of this Verblijfstitel.  # noqa: E501
        :rtype: DatumOnvolledig
        """
        return self._datum_ingang

    @datum_ingang.setter
    def datum_ingang(self, datum_ingang):
        """Sets the datum_ingang of this Verblijfstitel.


        :param datum_ingang: The datum_ingang of this Verblijfstitel.  # noqa: E501
        :type: DatumOnvolledig
        """

        self._datum_ingang = datum_ingang

    @property
    def in_onderzoek(self):
        """Gets the in_onderzoek of this Verblijfstitel.  # noqa: E501


        :return: The in_onderzoek of this Verblijfstitel.  # noqa: E501
        :rtype: VerblijfstitelInOnderzoek
        """
        return self._in_onderzoek

    @in_onderzoek.setter
    def in_onderzoek(self, in_onderzoek):
        """Sets the in_onderzoek of this Verblijfstitel.


        :param in_onderzoek: The in_onderzoek of this Verblijfstitel.  # noqa: E501
        :type: VerblijfstitelInOnderzoek
        """

        self._in_onderzoek = in_onderzoek

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, Verblijfstitel):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Verblijfstitel):
            return True

        return self.to_dict() != other.to_dict()
