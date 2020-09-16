package org.myproject.appleservice.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.myproject.appleservice.model.StorageComponents;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("storageDao")
public class StorageDaoImpl extends AbstractDao<Integer, StorageComponents> implements StorageDao {
    @Override
    public StorageComponents findById(int id) {
        StorageComponents storageComponents = getByKey(id);
        return storageComponents;
    }

    @Override
    public void save(StorageComponents storageComponents) {
        persist(storageComponents);
    }

    @Override
    public void deleteById(int id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        StorageComponents storageComponents = (StorageComponents) criteria.uniqueResult();
        delete(storageComponents);

    }

    @Override
    public List<StorageComponents> findAllStorage() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        List<StorageComponents> storageComponents = (List<StorageComponents>) criteria.list();
        return storageComponents;
    }
}
