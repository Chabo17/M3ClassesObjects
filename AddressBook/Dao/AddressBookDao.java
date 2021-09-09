package AddressBook.Dao;

import java.util.List;

import AddressBook.Dto.Address;



public interface AddressBookDao {

    /**
     * Adds the given Address to the roster and associates it with the given
     * Address id. If there is already a Address associated with the given
     * Address id it will return that Address object, otherwise it will
     * return null.
     *
     * @param studentId id with which Address is to be associated
     * @param Address Address to be added to the roster
     * @return the Address object previously associated with the given  
     * Address id if it exists, null otherwise
     * @throws ClassRosterDaoException
     */
    Address addStudent(String studentId, Address Address) throws AddressBookDaoException;

    /**
     * Returns a List of all students in the roster.
     *
     * @return List containing all students in the roster.
     * @throws ClassRosterDaoException
     */
    List<Address> getAllStudents() throws AddressBookDaoException;

    /**
     * Returns the Address object associated with the given Address id.
     * Returns null if no such Address exists
     *
     * @param studentId ID of the Address to retrieve
     * @return the Address object associated with the given Address id,  
     * null if no such Address exists
     * @throws ClassRosterDaoException
     */
    Address getStudent(String studentId) throws AddressBookDaoException;

    /**
     * Removes from the roster the Address associated with the given id.
     * Returns the Address object that is being removed or null if
     * there is no Address associated with the given id
     *
     * @param studentId id of Address to be removed
     * @return Address object that was removed or null if no Address
     * was associated with the given Address id
     * @throws ClassRosterDaoException
     */
    Address removeStudent(String studentId) throws AddressBookDaoException;
}