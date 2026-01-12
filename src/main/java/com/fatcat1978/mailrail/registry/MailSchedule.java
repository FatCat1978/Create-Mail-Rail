package com.fatcat1978.mailrail.registry;
import com.fatcat1978.mailrail.data.schedule.instruction.FetchPackageExclusiveInstruction;
import com.simibubi.create.content.trains.schedule.Schedule;
import com.simibubi.create.content.trains.schedule.destination.ScheduleInstruction;
import net.createmod.catnip.data.Pair;
import net.minecraft.resources.ResourceLocation;

import com.fatcat1978.mailrail.Mailrail;

import java.util.function.Supplier;

public class MailSchedule {
    static {
        registerInstruction("package_retrieval_exclusive", FetchPackageExclusiveInstruction::new);
    }

    private static void registerInstruction(String name, Supplier<? extends ScheduleInstruction> factory) {
        Schedule.INSTRUCTION_TYPES.add(Pair.of(ResourceLocation.fromNamespaceAndPath(Mailrail.MODID, name), factory));
    }

    public static void init() {}
}
