/*
 *  Copyright (C) 2011 John Casey.
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *  
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.apache.maven.repository.internal;

import org.sonatype.aether.RepositorySystemSession;
import org.sonatype.aether.impl.internal.DefaultRemoteRepositoryManager;
import org.sonatype.aether.repository.RemoteRepository;
import org.sonatype.aether.spi.connector.RepositoryConnector;
import org.sonatype.aether.spi.connector.RepositoryConnectorFactory;
import org.sonatype.aether.transfer.NoRepositoryConnectorException;

import java.util.List;

public class RoutingRemoteRepositoryManager
    extends DefaultRemoteRepositoryManager
{
    
    @Override
    public DefaultRemoteRepositoryManager addRepositoryConnectorFactory( RepositoryConnectorFactory factory )
    {
        // TODO Implement RoutingRemoteRepositoryManager.addRepositoryConnectorFactory
        throw new UnsupportedOperationException( "Not Implemented." );
    }

    @Override
    public DefaultRemoteRepositoryManager setRepositoryConnectorFactories( List<RepositoryConnectorFactory> factories )
    {
        // TODO Implement RoutingRemoteRepositoryManager.setRepositoryConnectorFactories
        throw new UnsupportedOperationException( "Not Implemented." );
    }

    @Override
    public RepositoryConnector getRepositoryConnector( RepositorySystemSession session, RemoteRepository repository )
        throws NoRepositoryConnectorException
    {
        // TODO Implement RoutingRemoteRepositoryManager.getRepositoryConnector
        throw new UnsupportedOperationException( "Not Implemented." );
    }

}