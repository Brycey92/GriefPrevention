/*
 * This file is part of GriefPrevention, licensed under the MIT License (MIT).
 *
 * Copyright (c) bloodmc
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package me.ryanhamshire.griefprevention.configuration;

import me.ryanhamshire.griefprevention.claim.Claim;
import me.ryanhamshire.griefprevention.configuration.category.ClaimDataFlagsCategory;
import org.spongepowered.api.text.Text;

import java.util.List;
import java.util.UUID;

public interface IClaimData {

    boolean requiresSave();

    UUID getWorldUniqueId();

    UUID getOwnerUniqueId();

    Claim.Type getClaimType();

    String getDateCreated();

    String getDateLastActive();

    Text getClaimName();

    Text getGreetingMessage();

    Text getFarewellMessage();

    String getLesserBoundaryCorner();

    String getGreaterBoundaryCorner();

    List<UUID> getAccessors();

    List<UUID> getBuilders();

    List<UUID> getContainers();

    List<UUID> getCoowners();

    List<String> getProtectionBlackList();

    List<String> getBannedItemList();

    ClaimDataFlagsCategory getFlags();

    void setClaimOwnerUniqueId(UUID newClaimOwner);

    void setWorldUniqueId(UUID uuid);

    void setClaimType(Claim.Type type);

    void setDateLastActive(String date);

    void setClaimName(Text name);

    void setGreetingMessage(Text message);

    void setFarewellMessage(Text message);

    void setLesserBoundaryCorner(String location);

    void setGreaterBoundaryCorner(String location);

    void setAccessors(List<UUID> accessors);

    void setBuilders(List<UUID> builders);

    void setContainers(List<UUID> containers);

    void setCoowners(List<UUID> coowners);

    void setRequiresSave(boolean flag);

    void setFlags(ClaimDataFlagsCategory copyFlags);
}