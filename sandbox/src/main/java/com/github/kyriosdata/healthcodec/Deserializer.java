/*
* Copyright 2019 Instituto de Informática - UFG
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*    http://www.apache.org/licenses/LICENSE-2.0
* 
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
 */
package com.github.kyriosdata.healthcodec;

/**
 *
 * @author Gabriel
 */
public interface Deserializer {

    /**
     * Deserializador de DvBoolean
     *
     * @return Instância de DvBoolean
     */
    RMObject.DvBoolean deserializeDvBoolean();

    /**
     * Deserializador de DvIdentifier
     *
     * @return Instância de DvIdentifier
     */
    RMObject.DvIdentifier deserializeDvIdentifier();
    
    /**
     * Deserializador de UID;
     * 
     * @return Instância de UID
     */
    RMObject.UID deserializeUID();
    
    /**
     * Deserializador de InternetID
     *
     * @return Instância de InternetID
     */
    RMObject.InternetID deserializeInternetID();

    /**
     * Deserializador de ISO_OID
     *
     * @return Instância de ISO_OID
     */
    RMObject.ISO_OID deserializeISOOID();

    /**
     * Deserializador de UUID
     *
     * @return Instância de UUID
     */
    RMObject.UUID deserializeUUID();

    /**
     * Deserializador de TerminologyID
     *
     * @return Instância de TerminologyID
     */
    RMObject.TerminologyID deserializeTerminologyID();

    /**
     * Deserializador de GenericID
     *
     * @return Instância de GenericID
     */
    RMObject.GenericID deserializeGenericID();

    /**
     * Deserializador de TemplateID
     *
     * @return Instância de TemplateID
     */
    RMObject.TemplateID deserializeTemplateID();

    /**
     * Deserializador de CodePhrase
     *
     * @return Instância de CodePhrase
     */
    RMObject.CodePhrase deserializeCodePhrase();

    /**
     * Deserializador de DVURI
     *
     * @return Instância de DVURI
     */
    RMObject.DVURI deserializeDVURI();

    /**
     * Deserializador de DVEHRURI
     *
     * @return Instância de DVEHRURI
     */
    RMObject.DVEHRURI deserializeDVEHRURI();

    /**
     * Deserializador de VersionTreeID
     *
     * @return Instância de VersionTreeID
     */
    RMObject.VersionTreeID deserializeVersionTreeID();

    /**
     * Deserializador de ArchetypeID
     *
     * @return Instância de ArchetypeID
     */
    RMObject.ArchetypeID deserializeArchetypeID();

    /**
     * Deserializador de ObjectVersionID
     *
     * @return Instância de ObjectVersionID
     */
    RMObject.ObjectVersionID deserializeObjectVersionID();

    /**
     * Deserializador de HierObjectID
     *
     * @return Instância de HierObjectID
     */
    RMObject.HierObjectID deserializeHierObjectID();

    /**
     * Deserializador de ObjectID
     *
     * @return Instância de ObjectID
     */
    RMObject.ObjectID deserializeObjectID();

    /**
     * Deserializador de PartyRef
     *
     * @return Instância de PartyRef
     */
    RMObject.PartyRef deserializePartyRef();

    /**
     * Deserializador de ObjectRef
     *
     * @return Instância de ObjectRef
     */
    RMObject.ObjectRef deserializeObjectRef();

    /**
     * Deserializador de LocatableRef
     *
     * @return Instância de LocatableRef
     */
    RMObject.LocatableRef deserializeLocatableRef();

    /**
     * Deserializador de ProportionKind
     *
     * @return Instância de ProportionKind
     */
    RMObject.ProportionKind deserializeProportionKind();

    /**
     * Deserializador de AccessGroupRef
     *
     * @return instância de AccessGroupRef
     */
    RMObject.AccessGroupRef deserializeAccessGroupRef();

    /**
     * Deserializador de PartyIdentified
     *
     * @return instância de PartyIdentified
     */
    RMObject.PartyIdentified deserializePartyIdentified();

    /**
     * Deserializador de Archetyped
     *
     * @return instância de Archetyped
     */
    RMObject.Archetyped deserializeArchetyped();

    /**
     * Deserializador de DvEncapsulated
     *
     * @return instância de DvEncapsulated
     */
    RMObject.DvEncapsulated deserializeDvEncapsulated();

    /**
     * Deserializador de UIDBasedID
     *
     * @return instância de DvEncapsulated
     */
    RMObject.UIDBasedID deserializeUIDBasedID();

    /**
     * Deserializador de DvParsable
     *
     * @return instância de DvParsable
     */
    RMObject.DvParsable deserializeDvParsable();

    /**
     * Deserializador de DvTimeSpecification
     *
     * @return instância de DvParsable
     */
    RMObject.DvTimeSpecification deserializeDvTimeSpecification();

    /**
     * Deserializador de DvMultimedia
     *
     * @return instância de DvMultimedia
     */
    RMObject.DvMultimedia deserializeDvMultimedia();
    
    /**
     * Deserializador de DvText
     * 
     * @return instância de DvText
     */
    RMObject.DvText deserializeDvText();
    
    /**
     * Deserializador de DvCodedText
     * 
     * @return instância de DvText
     */
    RMObject.DvCodedText deserializeDvCodedText();
    
    /**
     * Deserializador de TermMapping
     * 
     * @return instância de TermMapping;
     */
    RMObject.TermMapping deserializeTermMapping();
    
    /**
     * Deserializador de Link
     * @return nova instância de Link
     */
    RMObject.Link deserializeLink();
    
    /**
     * Deserializador de DvState
     * @return nova instância de DvState
     */
    RMObject.DvState deserializaDvState();
    
    /**
     * Deserializador de DvParagraph
     * @return nova instância de DvParagraph
     */
    RMObject.DvParagraph deserializeDvParagraph();
    
    /**
     * Deserializador de PartyProxy
     * @return nova instância de PartyProxy
     */
    RMObject.PartyProxy deserializePartyProxy();
    
    /**
     * Deserializador de FeederAuditDetails
     * @return nova instância de FeederAuditDetails
     */
    RMObject.FeederAuditDetails deserializeFeederAuditDetails();
    
    /**
     * Deserializador de FeederAudit
     * @return nova instância de FeederAudit
     */
    RMObject.FeederAudit deserializeFeederAudit();
    
    /**
     * Deserializador de Locatable
     * @return nova instância de Locatable
     */
    RMObject.Locatable deserializeLocatable();
    
    /**
     * Deserilizador de PartyRelated
     * @return nova instância de PartyRelated
     */
    RMObject.PartyRelated deserializePartyRelated();
    
    /**
     * Deserializador de PartySelf
     * @return nova instância de PartySelf
     */
    RMObject.PartySelf deserializePartySelf();
    
    /**
     * Deserializador de ResourceDescriptionItem
     * @return nova instância de ResourceDescriptionItem
     */
    RMObject.ResourceDescriptionItem deserializeResourceDescriptionItem();
    
    /**
     * Deserializador de TranslationDetails
     * @return nova instância de TranslationDetails
     */
    RMObject.TranslationDetails deserializeTranslationDetails();
    
    /**
     * Deserializador de Item
     * @return nova instância de Item
     */
    RMObject.Item deserializeItem();
    
    /**
     * Deserializador de Cluster
     * @return nova instância de Cluster
     */
    RMObject.Cluster deserializeCluster();
    
    /**
     * Deserializador de Element
     * @return nova instância de Element
     */
    RMObject.Element deserializeElement();
    
    /**
     * Deserializador de DataStructure
     * @return nova instância de DataStructure
     */
    RMObject.DataStructure deserializeDataStructure();
    
    /**
     * Deserializador de ItemList
     * @return nova instância de ItemList
     */
    RMObject.ItemList deserializeItemList();
    
    /**
     * Deserializador de ItemStructure
     * @return nova instância de ItemStructure
     */
    RMObject.ItemStructure deserializeItemStructure();
    
    
    /**
     * Deserializador de ItemSingle
     * @return nova instância de ItemSingle
     */
    RMObject.ItemSingle deserializeItemSingle();
    
    /**
     * Deserializador de ItemTable
     * @return nova instância de ItemTable
     */
    RMObject.ItemTable deserializeItemTable();
    
    /**
     * Deserializador de ItemTree
     * @return nova instância de ItemTree
     */
    RMObject.ItemTree deserializeItemTree();
    
    /**
     * Deserializador de PartyIdentity
     * @return nova instância de PartyIdentity
     */
    RMObject.PartyIdentity deserializePartyIdentity();
    
    /**
     * Deserializador de PartyRelationship
     * @return nova instância de PartyRelationship
     */
    RMObject.PartyRelationship deserializePartyRelationship();
    
    /**
     * Deserializador de Address
     * @return nova instância de Address
     */
    RMObject.Address deserializeAddress();
    
    /**
     * Deserializador de Contact
     * @return nova instância de Contact
     */
    RMObject.Contact deserializeContact();
    
    /**
     * Deserializador de Party
     * @return nova instância de Party
     */
    RMObject.Party deserializeParty();
    
    /**
     * Deserializadoe de Capability
     * @return nova instância de Capability
     */
    RMObject.Capability deserializeCapability();
    
    /**
     * Deserializador de Role
     * @return nova instância de Role
     */
    RMObject.Role deserializeRole();
    
    /**
     * Deserializador de Actor
     * @return nova instância de Actor
     */
    RMObject.Actor deserializeActor();
    
    /**
     * Deserializador de Agent
     * @return nova instância de Agent
     */
    RMObject.Agent deserializeAgent();
    
    /**
     * Deserializador de Group
     * @return nova instância de Group
     */
    RMObject.Group deserializeGroup();
    
    /**
     * Deserializador de Organisation
     * @return nova instância de Organisation
     */
    RMObject.Organisation deserializeOrganisation();
    
    /**
     * Deserializador de Person
     * @return nova instância de Person
     */
    RMObject.Person deserializePerson();
    
    /**
     * Deserializador de InstructionDetails
     * @return nova instância de InstructionDetails
     */
    RMObject.InstructionDetails deserializeInstructionDetails();
    
    /**
     * Deserializador de ISMTransition
     * @return nova instância de ISMTransition
     */
    RMObject.ISMTransition deserializeISMTransition();
    
    /**
     * Deserializador de Activity
     * @return nova instância de Activity
     */
    RMObject.Activity deserializeActivity();
}
