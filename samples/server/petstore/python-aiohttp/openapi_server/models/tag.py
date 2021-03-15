# coding: utf-8

from datetime import date, datetime

from typing import list, list, Type

from openapi_server.models.base_model_ import Model
from openapi_server import util


class Tag(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id: int=None, name: str=None):
        """Tag - a model defined in OpenAPI

        :param id: The id of this Tag.
        :param name: The name of this Tag.
        """
        self.openapi_types = {
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'id': 'id',
            'name': 'name'
        }

        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt: dict) -> 'Tag':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Tag of this Tag.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self):
        """Gets the id of this Tag.


        :return: The id of this Tag.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Tag.


        :param id: The id of this Tag.
        :type id: int
        """

        self._id = id

    @property
    def name(self):
        """Gets the name of this Tag.


        :return: The name of this Tag.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Tag.


        :param name: The name of this Tag.
        :type name: str
        """

        self._name = name
