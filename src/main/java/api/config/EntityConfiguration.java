package api.config;

import services.ProjectService;
import services.UserService;
import services.WorkspaceService;
import services.ClientService;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }
    },
    CLIENT {
        @Override
        public Class<?> getEntityService() {
            return ClientService.class;
        }
    };
    public abstract Class<?> getEntityService();
}