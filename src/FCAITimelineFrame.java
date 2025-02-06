import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class TimelineSegment {
    String name;
    int startTime;
    int endTime;
    Color color;

    public TimelineSegment(String name, int startTime, int endTime, Color color) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.color = color;
    }
}

// Visualization of FCAI Scheduler Timeline
class FCAITimelineFrame extends JFrame {
    public FCAITimelineFrame(List<TimelineSegment> segments) {
        setTitle("FCAI Scheduling Timeline");
        setSize(1600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new FCAITimelinePanel(segments));
        setVisible(true);
    }
}

class FCAITimelinePanel extends JPanel {
    List<TimelineSegment> segments;

    public FCAITimelinePanel(List<TimelineSegment> segments) {
        this.segments = segments;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int x = 20; // Starting position
        int y = 100; // Vertical position
        int height = 60; // Bar height
        int scale = 40; // Increased scale for even wider blocks

        g2d.setFont(new Font("Arial", Font.BOLD, 16));

        for (TimelineSegment segment : segments) {
            int width = (segment.endTime - segment.startTime) * scale;
            g2d.setColor(segment.color);
            g2d.fillRect(x, y, width, height);
            g2d.setColor(Color.BLACK);
            g2d.drawRect(x, y, width, height);

            // Draw the label
            g2d.drawString(segment.name, x + width / 2 - 10, y + height / 2);

            x += width;
        }

        // Draw the timeline axis
        g2d.setColor(Color.BLACK);
        g2d.drawLine(20, y + height + 10, x, y + height + 10);

        // Draw time markers
        x = 20;
        for (TimelineSegment segment : segments) {
            g2d.drawString(String.valueOf(segment.startTime), x - 5, y + height + 30);
            x += (segment.endTime - segment.startTime) * scale;
        }
        g2d.drawString(String.valueOf(segments.get(segments.size() - 1).endTime), x - 5, y + height + 30);
    }
}

